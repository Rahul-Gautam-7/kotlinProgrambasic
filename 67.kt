fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    var temp=num;
    var reverse=0
    while (temp>0)
    {
        var rem=temp%10;
        reverse=(reverse*10)+rem;
        temp/=10
    }
    if(num == reverse)
    {
        println("The given number $num is palindrome.")
    }
    else
    {
        println("The given number $num is not palindrome.")
    }
}