fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    var temp =num;
    var count=0;
    while(temp>0)
    {
        var rem=temp%10
        count++;
        temp/=10;
    }
    if(count==4)
    {
        println("The number $num is 4 digit number")
    }
    else
    {
        println("The number $num is not 4 digit number")
    }
}