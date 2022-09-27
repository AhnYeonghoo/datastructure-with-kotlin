package week4

import java.lang.reflect.Array.get

interface QueueInterface<T> {

    fun enqueue(element: T): Boolean // 원소를 집어넣는 함수

    fun dequeue(): T? // 원소를 뺼 수도 있는데 그게 null일 수도 있음

    val count: Int // getter
        get

    val isEmpty: Boolean
        get() = count == 0 // 카운트의 getter를 이용해 반환

    fun peek(): T? // 원소를 골라서 빼는데 null일 수 있음
}

class ArrayListQueue<T> : QueueInterface<T> { // 인터페이스를 구현하는 구현체
    private val list = arrayListOf<T>()

    override val count: Int  // count getter 구현
        get() = list.size

    override fun peek(): T? = list.getOrNull(0) // 첫번째 요소 반환하는데,  null도 가능

    override fun enqueue(element: T): Boolean {
        list.add(element)
        return true
    }

    override fun dequeue(): T? =
        if (isEmpty) null else list.removeAt(0)

    override fun toString(): String = list.toString()
}

fun main() {
    val queue = ArrayListQueue<String>().apply {
        enqueue("Ray")
        enqueue("Brian")
        enqueue("eric")
    }
    println(queue)
    println(queue.dequeue())
    println(queue)
    println("Next Up: ${queue.peek()}")
}