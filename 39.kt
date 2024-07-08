fun main() {

    while (true) {

        println("-----menu-------")
        println(" 1 for additon ")
        println(" 2 for subtraction ")
        println(" 3 for multiplication ")
        println(" 4 for division ")
        println(" 5 for exit ")

        print("Enter your choice : ")
        var choice = readln().toInt();

        when (choice) {
            1 -> {
                println("Enter first number")
                var num = readln().toFloat();
                println("Enter second number")
                var num1 = readln().toFloat();
                println("Addition is " + (num + num1));
            }
            2 -> {
                println("Enter first number")
                var num = readln().toFloat();
                println("Enter second number")
                var num1 = readln().toFloat();
                println("Subtraction is " + (num - num1))
            }
            3 ->{
                println("Enter first number")
                var num = readln().toFloat();
                println("Enter second number")
                var num1 = readln().toFloat();
                println("Multiplication is " + (num * num1))
            }
            4 -> {
                println("Enter first number")
                var num = readln().toFloat();
                println("Enter second number")
                var num1 = readln().toFloat();
                println("Division is " + (num + num1))
            }
            5 -> System.exit(0);
            else -> {
                println("invalid input")
            }
        }
    }





}