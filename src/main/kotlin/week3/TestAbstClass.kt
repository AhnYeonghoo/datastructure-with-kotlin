package week3

abstract class TestAbstClass(val a: Int = 4) {
    abstract val b: Float
    abstract val c: String

    fun f1(): Float {
        return a * b
    }

    abstract fun f2(): Boolean
}

class ChildOfAbstClass (
    override val b: Float = 1.0f,
    override val c: String = "Empty"
): TestAbstClass (a=4) {
    override fun f2(): Boolean {
        return a < b
    }

    override fun toString(): String {
        return "a=$a, b=$b, c=$c"
    }

    fun f3(): String {
        return "f3() Func!"
    }
}

