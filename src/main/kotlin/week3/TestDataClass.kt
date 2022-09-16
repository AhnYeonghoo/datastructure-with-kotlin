package week3

data class TestDataClass2(
    var a: Int,
    val b: String = "Empty"
) {
    var c: Boolean = false
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is TestDataClass2)
            return false
        return this.a == other.a && this.b == other.b && this.c == other.c
    }
    override fun toString(): String {
        return "Var a = $a, Val b = $b"
    }

}

class TestDataClass {

}
