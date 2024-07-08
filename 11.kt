fun main() {
    print("Enter the length of rectangle : ")
    var length = readln().toFloat();
    print("Enter the width of rectangle : ")
    var width  = readln().toFloat();
    println("The perimeter of rectangle is :  ${2+(length+width)}")
    println("The area of rectangle is : ${length*width}")
}