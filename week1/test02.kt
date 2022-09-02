fun main() {
    val a = 5
    val b = 12
    var max = -1
    
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println(max)

    if (a > b) {
        println("a is greater.")
    } else if (a < b) {
        println("b is greater")
    } else {
        println("a == b")
    }
    println("Program end.")

    val c: Double = b * 1.0 / a
    if ( c > 1) {
        println("c > 1")
    } else {
        println("c <= 1")
    }
    println("Program end.")    
    println()
    println()
    println()
    val groupSize = 2
    when (groupSize) {
        1 -> println("Single")
        2 -> println("Pair")
        3 -> {
            println("Trio")
    }
        else -> println("This is either nobody or a big crowd")
    }

}
