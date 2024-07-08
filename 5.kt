fun main() {
    println("Enter prinicpal amount : ")
    var principal = readln().toDouble()
    println("Enter Rate of interest : ")
    var roe = readln().toDouble()
    println("Enter Number of time :")
    var time= readln().toDouble()

    var interest =Math.pow((1+(roe/100)),time)

    println("Simple Interest is : "+(principal*interest));
}