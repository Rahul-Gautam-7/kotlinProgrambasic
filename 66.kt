fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    var temp=num;
    var arm=0
    while (temp>0)
    {
        var rem=temp%10;
        arm+=(rem*rem*rem);
        temp/=10
    }
    if(arm==num) {
        println("The given  number $num is armstrong ")
    }
    else
    {
        println("The given number $num is not an armstrong number ")
    }
}