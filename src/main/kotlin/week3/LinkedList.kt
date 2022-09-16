package week3

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0
    fun isEmpty(): Boolean {
        return size == 0
    }
    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        }
        return head.toString()
    }

    fun push(value: T): Unit {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }
    fun append(value: T) {
        if (isEmpty()) {
            push(value)
            return
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size++
    }

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }

}

fun main() {
    var list = LinkedList<Int>()
    list.push(10)
    list.push(30)
    list.push(20)
    println(list)
    var list2 = LinkedList<Int>()
    list.append(10)
    list.append(30)
    list.append(20)
    println(list)
    println()
    println()
    val list3 = LinkedList<Int>()
    list3.append(10)
    list3.append(30)
    list3.append(20)
    println("Before inserting: $list3")
    var middleNode = list3.nodeAt(1)!!
    for (i in 1..3) {
        middleNode = list3.insert(-1 * i, middleNode)
    }
    println("After inserting $list3")
}