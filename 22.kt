fun main() {
    print("Enter your salary : ")
    var sal= readln().toFloat();
    println("TA : "+((sal*4)/100))
    println("DA : "+((sal*30)/100))
    println("HRA : "+((sal*15)/100))
    println("tax : "+((sal*3)/100))
    println("PF : "+((sal*12)/100))
    println("Net Salary is  : "+((sal*64)/100))
}