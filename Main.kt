//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
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