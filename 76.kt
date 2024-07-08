fun main() {
    for (i in 1..5)
    {
        for (j in 1 .. i )
        {
            print(i)
        }
        for (k in i until 5)
        {
            print("$")
        }
        println()
    }
}