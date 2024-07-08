fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    var temp=num;
    var count=0
    while (temp>0)
    {
        var rem=temp%10;
        if(rem==0)
        {
            count++
        }
        temp/=10
    }
    println("The given number $num has $count zeros ")
}