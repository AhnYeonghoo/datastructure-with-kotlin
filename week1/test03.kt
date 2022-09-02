fun main() {
    for (i in 1..5) {
        println(i)
    }
    for (i in arrayOf(50, 39, 6, -1)) {
        println(i * -1.0)
    }

    var x = 10
    while ( x > 0) {
        x--
    }
    println(x)

    x = 10
    do {
        x -= 10
    } while(x > 0)
    println(x)
}