fun max(a: Int, b: Int) : Int {
    return if (a > b) a else b
}
class Person(
    private var age: Int,
    public var name: String = "Noname",
    sayhi: String
) {
    init {
        println("$name ($age): $sayhi")
    }
}

fun main() {
    println(max(5, -1))
    var p1: Person = Person(10)
    println(p1.name)
    println(p1)
    var p2 :Person = Person(10, "KEvin" , "Hi, there!")
    println(p2.name)

}