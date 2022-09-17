package week3

fun printSorted2(numbers: List<Int>) {

    if (numbers.isEmpty()) return

    var currentCount = 0
    var minValue = Int.MIN_VALUE

    for (value in numbers) {
        if (value == minValue) {
            println(value)
            currentCount += 1
        }
    }

    while (currentCount < numbers.size) {

        var currentValue = numbers.maxOrNull()!!
        for (value in numbers) {
            if (value < currentValue && value > minValue) {
                currentValue = value
            }
        }
        for (value in numbers) {
            if (value == currentValue) {
                println(value)
                currentCount += 1
            }
        }
        minValue = currentValue
    }
}

fun main() {
    val numbers = listOf(1, -5, 3, 56, 66, 68, 88 ,98 ,101)
    printSorted2(numbers)
}