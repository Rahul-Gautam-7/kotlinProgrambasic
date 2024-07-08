fun main() {
    print("Enter a number : ")
    var num= readln().toInt()
    if(num <= 0)
    {
        print("Invalid number ")
    }
    else if(num%2==0)
    {
        println("Even number ")
    }
    else
    {
        println("Odd number ")
    }
}