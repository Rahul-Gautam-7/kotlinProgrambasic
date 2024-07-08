fun main() {
    print("Enter the first number : ")
    var num1 = readln().toFloat();
    print("Enter the second number : ")
    var num2 = readln().toFloat();
    println("Before Swapping : number 1 is ${num1} and number 2 is $num2 ")
    var temp:Float=0.0f;
    temp=num1;
    num1=num2;
    num2=temp;
    println("After swapping : the number 1 is $num1 and number 2 is $num2 ")
}