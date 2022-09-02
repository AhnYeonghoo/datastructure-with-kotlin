class Box {
    var content: Any? = null
    fun put(content: Any?) {
        this.content = content
    }
    fun retrieve(): Any? {
        return content
    }
    fun isEmpty(): Boolean {
        return content == null
    }
}

class UpBox<T> {
    var content : T? = null
    fun put(content: T?) {
        this.content = content
    }
    fun retrieve(): T? {
        return content
    }
    fun isEmpty(): Boolean {
        return content == null
    }
}

fun main() {
    val box = UpBox<Int>() // 미리 형식을 정의하지 않고, 템플릿으로 여지를 줄수 있음
    box.put(4)
    val boolBox = UpBox<Boolean>()
    boolBox.put(true)
    println(boolBox.isEmpty())
}