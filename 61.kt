fun main() {
    print("Enter a number : ")
    var num= readln().toInt();
    var count =0;
    for (i in 1..num)
    {
        if(num%i==0)
        {
            count++
        }
    }
    if(count ==2)
    {
        print("$num is a prime number ")
    }
    else
    {
        print("$num is not a prime number")
    }
}