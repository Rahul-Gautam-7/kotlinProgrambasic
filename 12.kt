fun main() {
    print("Enter the radius of the circle : ")
    val name = readln()
    if(name.toFloatOrNull() != null)
    {
        var rt= name.toFloat()
        println("Area of circle is : "+(rt*rt*3.14))
    }
    else
    {
        println("Invalid input")
    }
}