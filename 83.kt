fun main() {
    var num=1
    for (i in 1..5)
    {
        for(j in 1..i)
        {
            print(num)
            num++
        }
        println()
    }
}