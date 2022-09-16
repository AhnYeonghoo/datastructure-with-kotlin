fun main() {
    var result: Int = 0
    for (x in 30..70) {
        if (x % 3 == 0) {
            result += x
        }
    }
    println(result)

//    println(max(6))
}

//fun max(k: Int) : Int {
//    var ret: Int = 0
//    for (i in 1..k) {
//        if (i % 2 == 1)
//            ret += i
//    }
//    return ret
//}