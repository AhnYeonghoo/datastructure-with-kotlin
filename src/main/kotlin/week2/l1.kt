 class Person (
     private var age: Int,
     public var name: String = "Nonname"

 ){
     init {
         println("$name ($age)")
     }
 }

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
 fun max(a: Int, b: Int): Int {
     return if (a > b) a else b
 }
 class Box<T> {
     var content: T? = null
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

fun max(k: Int): Int {
    var ret: Int = 0
    for (i in 1..k) {
        if (i % 2 == 0)
            ret += i
    }
    return ret
}
fun main() {
    var result: Int = 0
    for (i in 30..70) {
        if (i % 3 == 0) {
            result += i
        }
    }
    println(max(6))
    println(result)
     val box = Box<Int>()
     box.put(4)
     val boolBox = Box<Boolean>()
     boolBox.put(true)
     boolBox.isEmpty()
     var b1: Box = Box()
     b1.put("Apple")
     var b2: Box = Box()
     b2.put(3)
     println(b1.retrieve())
     println(b2.retrieve())
     b1.put(5)
     println(b1.retrieve())

     var person: Person = Person(20, "KEvin")
     println(person.name)
     println(max(3, 1))
     var name1: String = "우왕이"
     val name2: String = "Left왕이"

     name1 = "컴돌이"

     var score: Int
     score = 70
     score = 71.0
     score = "hey"

     var score1: Array<Int> = arrayOf(100, 90, 80)
     var score2: Array<Int>? = null
     var score3: Array<Int> = score2 ?: score1
     println(score1.size)
     println(score2?.size)
     println(score3.get(0))

     val a: Int = 5
     val b: Int = 12
     var max: Int = -1

     if (a > b) {
         max = a
     } else {
         max = b
     }
     println(max)

     val groupSize = 2
     when (groupSize) {
         1 -> println("Single")
         2 -> println("Pair")
         3 -> {
             println("Trio")
         }
         else -> println("This is either nobody or a big crowd")
     }

     for (i in 1..5) {
         println(i)
     }
     for (i in arrayOf(50, 39, 6, -1)) {
         print(i * -1.0)
     }

     var x: Int = 10
     while (x > 0) {
         x--
     }
     println(x)
     x = 10
     do {
         x -= 1
     } while (x > 0)
     println(x)

}

