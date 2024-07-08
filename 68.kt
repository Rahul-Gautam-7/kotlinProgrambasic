fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    var temp=num;
    var even=0;
    var odd=0
    while (temp>0)
    {
        var rem=temp%10;
        if(rem%2==0)
        {
            even++
        }
        else{
            odd++
        }
        temp/=10
    }
    println("The given number $num has $even even digits and $odd odd digits")

}