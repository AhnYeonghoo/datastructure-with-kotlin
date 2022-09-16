package week3

fun printNames(names: List<String>) {
    for (name in names) {
        println(name)
    }
}

fun main() {
    val names: List<String> = listOf("Kevin", "Mila", "Sally")
    printNames(names)


}