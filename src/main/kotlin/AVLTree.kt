import java.util.Collections.max
import kotlin.math.max
import kotlin.math.pow

class AVLTree<T: Comparable<T>> {
    var root: AVLNode<T>? = null
    override fun toString() = root?.toString() ?: "empty tree"

    private fun leftRotate(node: AVLNode<T>): AVLNode<T> {
        val pivot = node.rightChild!!
        node.rightChild = pivot.leftChild
        pivot.leftChild = node
        node.height = max(node.leftHeight, node.rightHeight) + 1
        pivot.height = max(pivot.leftHeight, pivot.rightHeight) + 1
        return pivot
    }

    private fun rightRotate(node: AVLNode<T>): AVLNode<T> {
        val pivot = node.leftChild!!
        node.leftChild = pivot.rightChild
        pivot.rightChild = node
        node.height = max(node.leftHeight, node.rightHeight) + 1
        pivot.height = max(pivot.leftHeight, pivot.rightHeight) + 1
        return pivot
    }

    private fun rightLeftRotate(node: AVLNode<T>): AVLNode<T> {
        val rightChild = node.rightChild ?: return node
        node.rightChild = rightRotate(rightChild)
        return leftRotate(node)
    }

    private fun leftRightRotate(node: AVLNode<T>): AVLNode<T> {
        val leftChild = node.leftChild ?: return node
        node.leftChild = rightRotate(leftChild)
        return rightRotate(node)
    }

    private fun balanced(node: AVLNode<T>): AVLNode<T> {
        return when (node.balanceFactor) {
            2 -> {
                if (node.leftChild?.balanceFactor == -1)
                    leftRightRotate(node)
                else
                    rightRotate(node)
            }
            -2 -> {
                if (node.rightChild?.balanceFactor == 1)
                    rightLeftRotate(node)
                else
                    leftRotate(node)
            }
            else -> node
        }
    }

    private fun insert(node: AVLNode<T>?, value: T): AVLNode<T>? {
        node ?: return AVLNode(value)
        if (value < node.value) {
            node.leftChild = insert(node.leftChild, value)
        } else {
            node.rightChild = insert(node.rightChild, value)
        }
        val balancedNode = balanced(node)
        balancedNode?.height = Math.max(
            balancedNode?.leftHeight ?: 0,
            balancedNode?.rightHeight ?: 0
        ) + 1
        return balancedNode
    }

    fun insert(value: T) {
        root = insert(root, value)
    }

    private fun remove(
        node: AVLNode<T>?,
        value: T
    ): AVLNode<T>? {
        node ?: return null
        when {
            value == node.value -> {
                if (node.leftChild == null && node.rightChild == null)
                    return null
                if (node.leftChild == null)
                    return node.rightChild
                if (node.rightChild == null)
                    return node.leftChild
                node.rightChild?.min?.value?.let {
                    node.value = it
                }
                node.rightChild = remove(node.rightChild, node.value)
            }
            value < node.value -> node.leftChild =
                remove(node.leftChild, value)
            else -> node.rightChild = remove(node.rightChild, value)
        }
        val balancedNode = balanced(node)
        balancedNode.height = max(
            balancedNode.leftHeight,
            balancedNode.rightHeight
        ) + 1
        return balancedNode
    }

    fun remove(value: T {
        root = remove(root, value)
    }

    fun leafNodesOfPerfect(height: Int): Int {
        return 2.0.pow().toInt()
    }

    fun nodesOfPerfect(height: Int): Int {
        var totalNodes = 0
        (0..height).forEach { currentHeight ->
            totalNodes += leafNodesOfPerfect(currentHeight)
        }
        return totalNodes

    }
}
