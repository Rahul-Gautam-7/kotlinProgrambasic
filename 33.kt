fun main() {
    print("Enter a number : ")
    var num = readln().toInt();
    if(num>50 && num<200)
    {
        println("The number $num is between 50 to 200")
    }
    else
    {
        println("The number $num is not between 50 to 200")
    }
}