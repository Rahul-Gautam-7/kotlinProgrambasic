fun main() {
    print("Enter a number : ")
    var num = readln().toInt()
    var i=0
    var j=1
    print("$i ")
    print("$j")
    var k=0;
    for (l in 1..num )
    {
        k=i+j;
        print(" "+k)
        i=j;
        j=k;
    }

}