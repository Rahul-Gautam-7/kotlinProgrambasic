fun main() {

    println("Enter the distance between the two cities in km : ")
    var distance = readln().toFloat()
    println("The distance in meter is : "+(distance*1000)+" meter");
    println("The distance in feet is : "+(distance*3280.84)+" feet");
    println("The distance in inch is : "+(distance*39370.1)+" inch");
    println("The distance in centimeter is : "+(distance*100000)+" centimeter");
}