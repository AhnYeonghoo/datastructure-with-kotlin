import java.util.*
import kotlin.collections.ArrayList

interface MyCollection<Element> {
    val count: Int
        get
    val isEmpty: Boolean
        get() = count == 0
    fun insert(element: Element)
    fun remove(): Element?
    fun remove(index: Int): Element?
}

interface HeapInterface<Element>: MyCollection<Element> {
    fun peek(): Element?
}

abstract class AbstractHeap<Element>() : HeapInterface<Element> {
    var elements: ArrayList<Element> = ArrayList<Element>()
    override val count: Int
        get() = elements.size

    override fun peek(): Element? = elements.first()
    private fun leftChildIndex(index: Int) = (2 * index) + 1
    private fun rightChildIndex(index: Int) = (2 * index) + 2
    private fun parentIndex(index: Int) = (index - 1) / 2

    abstract fun compare(a: Element, b: Element): Int

    override fun insert(element: Element) {
        elements.add(element)
        siftUp(count - 1)
    }

    private fun siftUp(index: Int) {
        var child = index
        var parent = parentIndex(child)
        while (child > 0 && compare(elements[child], elements[parent]) > 0) {
            Collections.swap(elements, child, parent)
            child = parent
            parent = parentIndex(child)
        }
    }

    private fun siftDown(index: Int) {
        var parent = index
        while (true) {
            val left = leftChildIndex(parent)
            val right = rightChildIndex(parent)
            var candidate = parent
            if (left < count &&
                compare(elements[left], elements[candidate]) > 0
            ) {
                candidate = left
            }
            if (right < count &&
                compare(elements[right], elements[candidate]) > 0
            ) {
                candidate = right
            }
            if (candidate == parent)
                return
            Collections.swap(elements, parent, candidate)
            parent = candidate
        }
    }

    override fun remove(index: Int): Element? {
        if (index >= count) return null
        return if (index == count - 1) {
            elements.removeAt(count - 1)
        } else {
            Collections.swap(elements, index, count - 1)
            val item = elements.removeAt(count - 1)
            siftDown(index)
            siftUp(index)
            item
        }
    }

    private fun index(element: Element, i: Int): Int? {
        if (i >= count)
            return null
        if (compare(element, elements[i]) > 0)
            return null
        if (element == elements[i])
            return i

        val leftChildIndex = index(element, leftChildIndex(i))
        if (leftChildIndex != null) return leftChildIndex
        var rightChildIndex = index(element, rightChildIndex(i))
        if (rightChildIndex != null) return rightChildIndex
        return null
    }

    fun heapify(values: ArrayList<Element>) {
        elements = values
        if (!elements.isEmpty()) {
            (count / 2 downTo 0).forEach {
                siftDown(it)
            }
        }
    }
}

class MaxHeap<Element: Comparable<Element>>(): AbstractHeap<Element>() {
    override fun compare(a: Element, b: Element): kotlin.Int {
        return a.compareTo(b)
    }
}

class MinHeap<Element: Comparable<Element>>() : AbstractHeap<Element>() {
    override fun compare(a: Element, b: Element): kotlin.Int {
        return b.compareTo(a)
    }
}



