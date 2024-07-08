fun main() {
    print("Enter your amount to pay : ")
    var amt = readln().toFloat()
    if(amt>0 && amt<=5000)
    {
        var discount=(amt*7.5)/100
        println("Your bill is : $amt")
        println("Your discount is : "+discount)
        println("You have to pay only ${amt-discount}")
    }
    else if (amt>5000)
    {
        var discount=(amt*11)/100
        println("Your bill is : $amt")
        println("Your discount is : "+discount)
        println("You have to pay only ${amt-discount}")
    }
}