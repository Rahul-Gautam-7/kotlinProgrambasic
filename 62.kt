fun main() {
    print("Enter a starting point : ")
    var num= readln().toInt();
    print("Enter a ending point : ")
    var num2 = readln().toInt()
    var flag=false;
    for (i in num .. num2)
    {
        flag=true;
        for(j in 2 until i)
        {
            if(i%j == 0)
            {
                flag=false
                break;
            }
        }
        if(flag)
        {
            print("$i ")
        }
    }
}