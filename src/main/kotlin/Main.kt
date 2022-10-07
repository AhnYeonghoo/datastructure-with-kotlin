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
}