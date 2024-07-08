fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    print("Factorial of $num is : ")
    for (i in 1..num)
    {
        if(num%i == 0)
        {
            print("$i ")
        }
    }
}