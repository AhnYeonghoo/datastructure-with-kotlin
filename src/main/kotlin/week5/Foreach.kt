package week5

import java.util.*

fun test(str: String?) {
    val theStr = str?: "unknown"
    println(theStr)
}
fun main() {
    var k1 = (1..6).toList()

    k1.forEach {
        if (it == 2) { return@forEach }
        println(it * 10)
    }
    run {
        println("들어간다!")
        k1.subList(0, 4).forEach {
            println(it)
            if (it % 2 == 0)
                return@run
        }
        println("나왔다!s")
    }
    println("끝났다!")
    test("Hello")
    test(null)

    val calendar = Calendar.getInstance()
    if (calendar.firstDayOfWeek == Calendar.SUNDAY) {
        calendar.firstDayOfWeek = Calendar.MONDAY
    }
    if (!calendar.isLenient) {
        calendar.isLenient = true
    }
    println(calendar)
}