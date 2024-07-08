fun main() {
    print("Enter the first number : ")
    var num1 = readln().toFloat()
    print("Enter the second number : ")
    var num2 = readln().toFloat();
    if (num1>num2)
    {
        print("$num2 is smaller than $num1")
    }
    else if(num2>num1)
    {
        print("$num1 is smaller than $num2")
    }
    else
    {
        print("The numbers are equal")
    }
}