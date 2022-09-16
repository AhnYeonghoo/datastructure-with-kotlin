package week3

interface TestInterface {
    fun f1(): String = "Interface: f1 called"
    fun f2(a: String) { println("Interface: f2 called") }
    fun f3(a: String): String {
        return " Interface: f3() called. a = $a"
    }
}

class ChildOfInterface(val x: Int): TestInterface {
    override fun f1(): String = "f1 called"
    override fun f2(a: String) { println("f2 called. a= $a") }
    fun f4(): String = "f4() called value x = $x"
}