fun main() {
    print("Enter a number : ")
    var num = readln().toInt();
    if(num>0 && num<100)
    {
        println("The number $num is between 0 to 100")
    }
    else
    {
        println("The number $num is not between 0 to 100")
    }
}