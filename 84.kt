fun main() {
//    for (i in 1..4)
//    {
//        val str = StringBuilder()
//        for (j in 0 until i)
//        {
//            str.append((i+j)%2)
//        }
//        println(str.toString())
//    }
    for (i in 1..5) {
        val line = StringBuilder()
        for (j in 0 until i) {
            line.append((i + j) % 2)
        }
        println(line.toString())
    }
}