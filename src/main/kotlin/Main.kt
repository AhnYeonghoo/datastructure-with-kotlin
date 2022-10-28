fun main() {
    val exampleTree = BinarySearchTree<Int>().apply {
        insert(3); insert(1); insert(4)
        insert(0); insert(2); insert(5);
    }
    if (exampleTree.contains(5)) {
        println("Found 5!")
    } else {
        println("Couldn't find 5")
    }
    TheThing.items.add("C")
    println(TheThing)

    val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length}
    println(listOf("aaa", "bb", "c").sortedWith(lengthComparator))


}

object TheThing {
    val items = arrayListOf<String>("A", "B")

    override fun toString(): String {
        var ret = "TheThing: "
        items.forEach {
            ret += it
        }
        return ret
    }
}