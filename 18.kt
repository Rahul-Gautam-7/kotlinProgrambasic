fun main() {
    print("Enter the value of x  : ")
    var x = readln().toDouble();
    print("Enter the value of y : ")
    var y = readln().toDouble()
    var xsq= 3*Math.pow(x,2.0)
    var ysq= 3*Math.pow(y,2.0)
    println("The expression 3X2+2XY+3Y2 is : "+(xsq+(2*x*y)+ysq));
}