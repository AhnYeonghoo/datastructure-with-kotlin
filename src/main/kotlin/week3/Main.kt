package week3

class Main {

}

fun main() {
    var o1: TestDataClass2 = TestDataClass2(3)
    var o2: TestDataClass2 = TestDataClass2(5, "Hello")
    val o3: TestDataClass2 = o2.copy()

    val eq: Boolean = o1.equals(o2)
    println(eq)
    println(o2.equals(o3))

    var (a, b) = o1
    println("$a\t$b")
    println(o1)

    var o4: TestAbstClass = ChildOfAbstClass()
    println(o4)
    println(o4.f1())
    println(o4.f2())

    println()
    println()

    var o5: ChildOfInterface = ChildOfInterface(10)
    println(o5)
    println(o5.f1())
    println(o5.f2("a"))
    println(o5.f3("b"))
    println(o5.f4())

    println()
    println()

    val cat: Cat = Cat(name="Tom")
    cat.talk()

    println()
    println()
    println()
    var tc = Man("Kevin", 23, "Student")

    println(tc.age)
    println(tc.job)
    println(tc.address)
    println(tc.strength)

    tc.address = "Earth"
    println(tc.address)

    tc.cursed = true
    println(tc.speed)

}
