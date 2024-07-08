fun main() {
    println("Enter prinicpal amount : ")
    var principal = readln().toFloat()
    println("Enter Rate of interest : ")
    var roe = readln().toFloat()
    println("Enter Number of years :")
    var years= readln().toFloat()

    println("Simple Interest is : "+((principal*roe*years)/100))
}