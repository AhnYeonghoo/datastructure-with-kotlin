package week3

import java.io.Closeable

open class Animal(var age: Int)

class Cat(age: Int = 1, var name: String) : Animal(age) {
    fun talk() {
        print("${name}: ")
        for (i in 1..age) {
            print("야옹")
        }
        println()
    }
}

class TestClass<T> {
    fun fun1(x: T) {
        println(x.toString())
    }

    fun <T : Closeable> fun2(x: T) {
        x.close()
    }

    fun <T> fun3(x: T) where T : Closeable, T : Iterable<T> {
        x.close()
        var it = x.iterator()
    }
}

class Man(
    name: String,
    var age: Int,
    var job: String
) {
    var address: String = "Nowhere"
        get
        set(v) {
            field = "address: $v"
        }

    var cursed: Boolean = false
    var speed: Int = 100
        get() {
            return field - (if (cursed == true) 10 else 0)
        }

    val strength: Int = 50
        get
}