fun main() {
    println("hello")
    var name1:String = "nad"  // var로 선언 
    val name2:String = "nad2"  // val로 선언
    name1 = "nadNew"
    // name2 = "컴순이" var은 변수, val도 변수지만 상수같은 변수 reassign X
    println(name1)
    println(name2)

    var score : Int
    score = 10
    // score = 71.0 불가능
    // score = "hey" 타입 에러
    println(score)
    var scores1 = arrayOf(100, 90, 80)
    var scores2: Array<Int>? = null
    println(scores1.size)
    println(scores2?.size)
    println(scores2!!.size)

    var scores3 : Array<Int> = scores2 ?: scores1
    print(scores3.get(0))
    var score1 = arrayOf(100, 90, 80)
    var score2: Array<Int>? = null
    var score3: Array<Int> = score2 ?: score1 
    println(score3.get(0))
}
