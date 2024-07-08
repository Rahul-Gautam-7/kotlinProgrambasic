fun main() {
    for(i in 0..5)
    {
        for(j in 0 .. 5-i)
        {
            print(" ")
        }
        for(k in 0..i)
        {
            print("* ")
        }
        println()
    }
}