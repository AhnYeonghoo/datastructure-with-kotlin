package week4

interface StackInterface<Element> {

    val count: Int
        get

    fun peek(): Element?

    val isEmpty: Boolean
        get() = count == 0

    fun push(element: Element)
    fun pop(): Element?
}

class Stack<Element>() : StackInterface<Element> {
    private val storage = arrayListOf<Element>()

    override fun toString() = buildString {

        appendLine("----Top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-------")
    }

    override fun push(element: Element) {
        storage.add(element)
    }

    override fun pop(): Element? {
        if (storage.size == 0) return null
        return storage.removeAt(count - 1)
    }

    override fun peek(): Element? {
        return storage.lastOrNull()
    }

    override val count: Int
        get() = storage.size
}

fun String.checkParentheses(): Boolean {


    for (character in this) {

        when (character) {

            '(' -> stack.push(character)
            ')' -> if (stack.isEmpty) {

                return false

            } else {

                stack.pop()

            }
        }
    }
    return stack.isEmpty

}
val stack = Stack<Char>()


fun main() {
    val stack = Stack<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)

        print(stack)
        val popedElement = stack.pop()
        if (popedElement != null) {
            println("Popped: $popedElement")
        }
        print(stack)
    }
    println(stack.peek())

    val s = "H((e))llo(world)()"
    println(s.checkParentheses())
    println("(Hello World".checkParentheses())
}



