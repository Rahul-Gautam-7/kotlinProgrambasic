fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    if(num%3==0 && num%7!=0)
    {
        print("The number $num is divisible by 3 and not divisible by 7")
    }
    else
    {
        println("Not divisble ")
    }
}