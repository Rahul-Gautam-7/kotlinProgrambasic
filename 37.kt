fun main() {
    print("Enter first number : ")
    var num1 = readln().toFloat()
    print("Enter second number : ")
    var num2 = readln().toFloat()
    print("Enter third number : ")
    var num3 = readln().toFloat()
    if (num1 < num2 && num1 < num3)
    {
        print("$num1 is smallest ")
    } else if (num2 < num1 && num2 < num3)
    {
        print("$num2 is smallest")
    }
    else if(num3< num1 && num3<num2)
    {
        print("$num3 is smallest")
    }
    else
    {
        print("The numbers are same")
    }
}