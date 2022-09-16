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

    fun push(value: T): LinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }
    fun append(value: T): LinkedList<T> {
        if (isEmpty()) {
            push(value)
            return this
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size++
        return this
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

    fun pop(): T? {
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next
        if (isEmpty()) tail = null
        return result
    }

    fun removeLast(): T? {
        val head = head ?: return null
        if (head.next == null) return pop()
        size--
        var prev = head
        var current = head
        var next = current.next
        while (next != null) {
            prev = current
            current = next
            next = current.next
        }
        prev.next = null
        tail = prev
        return current.value
    }

}

fun main() {
    var list = LinkedList<Int>()
    list.push(10).push(20).push(30)
    println(list)
    var poppedValue = list.pop()
    println(poppedValue)
    var list2 = LinkedList<Int>()
    list.append(10).append(30).append(20)
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