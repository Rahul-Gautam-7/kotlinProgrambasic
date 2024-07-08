fun main() {
    print("Enter java marks : ")
    var java = readln().toInt()
    print("Enter kotlin marks : ")
    var kotlin = readln().toInt()
    print("Enter Android marks : ")
    var android = readln().toInt()
    print("Enter DBMS marks : ")
    var DBMS = readln().toInt();
    print("Enter Python marks : ")
    var python = readln().toInt();

    var marks=(java+kotlin+android+DBMS+python)
    var percentage= (marks*100)/500
    println("Your marks is  $marks out of 500 and percentage is $percentage %")
    if(percentage>90)
    {
        println("AA Grade ")
    }
    else if(percentage>80)
    {
        println("A Grade")
    }
    else if(percentage>70)
    {
        println("BB Grade")
    }
    else if(percentage>60)
    {
        println("B Grade")
    }
    else if(percentage>50)
    {
        println("C Grade")
    }
    else if(percentage>35)
    {
        println("D Grade")
    }
    else
    {
        println("RA")
    }

}