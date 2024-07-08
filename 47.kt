fun main() {
    print("Enter any character : ")
    var ch= readln()
    if (ch>= "A" && ch<="Z")
    {
        print("It is a Capital letter ")
    }
    else if (ch>="a" && ch<="z")
    {
        println("It is a small letter ")
    }
    else if(ch.toFloatOrNull() != null)
    {
        println("It is a digit ")
    }
    else
    {
        println("It is a special character ")
    }

}