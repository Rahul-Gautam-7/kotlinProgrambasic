fun main() {
    print("Enter the first number : ")
    var num1 = readln().toFloat()
    print("Enter the second number : ")
    var num2 = readln().toFloat();
    if (num1>num2)
    {
        print("$num1 is greater than $num2")
    }
    else if(num2>num1)
    {
        print("$num2 is greater than $num1")
    }
    else
    {
        print("The numbers are equal")
    }
}