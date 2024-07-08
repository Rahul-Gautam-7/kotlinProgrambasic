fun main() {
    print("Enter a number : ")
    var num = readln().toInt();
    if (num>0)
    {
        for (i in 1..10)
        {
            println("$num x $i = ${num*i}")
        }
    }
}