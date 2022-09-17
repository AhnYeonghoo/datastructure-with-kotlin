package week3

fun linearContains(value: Int, numbers: List<Int>): Boolean {
    for (element in numbers) {
        if (element == value) {
            return true
        }
    }
    return false
}

fun pseudoBinaryContains(value: Int, numbers: List<Int>): Boolean {
    if (numbers.isEmpty()) return false
    val middleIndex = numbers.size / 2
    if (value <= numbers[middleIndex]) {
        for (index in 0..middleIndex) {
            if (numbers[index] == value) {
                return true
            }
        }
    } else {
        for (index in middleIndex until numbers.size) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}

fun sumFromOne(n: Int): Int {
    return n * (n + 1) / 2
}

fun main() {
    val numbers = listOf(1, 3, 56, 66, 68, 89, 99, 105, 480)
    println(linearContains(99, numbers))
    println(pseudoBinaryContains(99, numbers))
}