fun main() {
    print("Enter a number : ")
    var num = readln().toInt();
    when(num)
    {
        1-> print("Monday")
        2-> print("Tuesday")
        3->print("Wednesday")
        4-> print("Thursday")
        5-> print("Friday")
        6-> print("Saturday")
        7-> print("Sunday")
        else-> print("Invalid input ")
    }
}