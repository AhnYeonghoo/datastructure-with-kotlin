fun <T: Comparable<T>> List<T>.mergeSort(): List<T> {
    if (this.size < 2) return this
    val middle = this.size / 2
    val left = this.subList(0, middle).mergeSort()
    val right = this.subList(middle, this.size).mergeSort()
    return merge(left, right)
}

private fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
    var leftIndex = 0
    var rightIndex = 0
    val result = mutableListOf<T>() 

    while (leftIndex < left.size && rightIndex < right.size) {
        val leftElement = left[leftIndex]
        val rightElement = right[rightIndex]
        if (leftElement < rightElement) {
            result.add(leftElement)
            leftIndex += 1
        } else if (leftElement > rightElement) {
            result.add(rightElement)
            rightIndex += 1
        } else {
            result.add(leftElement)
            leftIndex += 1
            result.add(rightElement)
            rightIndex += 1
        }
    }

        if (leftIndex <left.size) 
            result.addAll(left.subList(leftIndex, left.size))
        if (rightIndex < right.size)
            result.addAll(right.subList(rightIndex, right.size))
        
        return result
}

fun main() {
    val list = listOf(7, 2, 6, 3, 9)
    println("Original:  $list ")
    val result = list.mergeSort()
    println("Merge sorted:  $result ")
}