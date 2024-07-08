fun main() {
    print("Enter a number : ")
    var num = readln().toFloat();
    if (num>0)
    {
        println("$num is positive number")
    }
    else if(num<0)
    {
        println("$num is negative number")
    }
    else
    {
        println("It is zero ")
    }
}