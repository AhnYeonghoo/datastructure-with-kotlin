package week5

import week3.LinkedList
import week4.ArrayListQueue

typealias Visitor<T> = (TreeNode<T>) -> Unit
typealias BinaryVisitor<T> = (T) -> Unit

class TreeNode<T> (val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)
        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }

    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)
        val queue = LinkedList<TreeNode<T>>()
        children.forEach { queue.enqueue(it)}
        var node = queue.dequeue()
        while (node != null) {
            visit(node)
            node.children.forEach { queue.enqueue(it) }
            node = queue.dequeue()
        }
    }

    fun search(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null
        forEachLevelOrder {
            if (it.value == value) {
                result = it
            }
        }
        return result
    }

    override fun toString(): String {
        val queue = ArrayListQueue<TreeNode>()
        var nodeLeftInCurrentLevel = 0
        var ret = ""
        queue.enqueue(this)
        while (queue.isEmpty.not()) {
            nodeLeftInCurrentLevel = queue.count
            while (nodeLeftInCurrentLevel > 0) {
                val node = queue.dequeue()
                node?.let {
                    ret += "${node.value}"
                    node.children.forEach { queue.enqueue(it) }
                    nodeLeftInCurrentLevel--
                } ?: break
            }
            ret += "\n"
        }
        return ret
    }
}


fun main() {
    val hot = TreeNode("Hot")
    val cold = TreeNode("cold")
    val beverages = TreeNode("Beverages").run {
        add(hot)
        add(cold)
    }
    val tree = makeBeverageTree()
    tree.forEachLevelOrder { println(it.value) }

    val tree2 = makeBeverageTree()
    tree.search("ginger ale")?.let {
        println("Found node: ${it.value}")
    }
    tree.search("WEK Blue")?.let {
        println(it.value)
    } ?: println("Couldn`t find WEK Blue")


  
}
