package week3

fun printSorted(numbers: List<Int>) {
    val sorted = numbers.sorted()
    for (element in sorted) {
        println(element)
    }
}

fun main() {
    val numbers = listOf(1, -5, 3, 56, 66 ,68 ,80, 99, 105, 450)
    printSorted(numbers)
}