fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    var i=1
    while (i<=num)
    {
        print("$i/${i+1} ")
        i++
    }
}