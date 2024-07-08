fun main() {
    print("Enter the first number : ")
    var num1 = readln().toFloat()
    print("Enter the second number : ")
    var num2 = readln().toFloat()
    println("Before swapping : first number is $num1 and second number is $num2")
    num1=num2+num1;
    num2=num1-num2;
    num1=num1-num2;
    println("After swapping : first number is $num1 and second number is $num2")
}