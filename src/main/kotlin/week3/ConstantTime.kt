package week3

fun checkFirst(names: List<String>) {
    if (names.firstOrNull() != null) {
        println(names.first())
    } else {
        println("no Names")
    }
}

fun main() {
    val names: List<String> = listOf("Kevin", "Mila", "Sally")
    val names2: List<String>? = listOf("", "odod")
    checkFirst(names)
    checkFirst(names2!!)
}