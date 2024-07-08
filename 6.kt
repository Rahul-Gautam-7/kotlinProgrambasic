fun main() {
    println("Enter your salary : ")
    var salary = readln().toFloat()
    var bonus = (salary*10)/100
    println("Your bonus is ${bonus} and the overall salary including bonus will be ${salary+bonus}")
}