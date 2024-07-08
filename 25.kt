fun main() {
    print("Enter the first number : ")
    var num1 = readln().toFloat()
    print("Enter the second number : ")
    var num2 = readln().toFloat();
    if (num1>num2)
    {
        println("$num2 is smaller number ")
        println("$num1 is largest number")
    }
    else if(num2>num1)
    {
        println("$num1 is smaller number ")
        println("$num2 is largest number")
    }
    else
    {
        print("The numbers are equal")
    }
}