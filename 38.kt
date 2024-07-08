fun main() {
    print("Enter your age : ")
    var age= readln().toInt();
    if(age>0 && age<5)
    {
        print("You are a kid")
    }
    else if (age>=5 && age<12)
    {
        print("You are a children")
    }
    else if(age>=12 && age<=19)
    {
        print("You are a teenager ")
    }
    else if(age>19 && age<=30)
    {
        print("You are young")
    }
    else if(age>30 && age<=60)
    {
        print("You are an mid-age")
    }
    else if(age>60)
    {
        print("You are old")
    }
    else
    {
        print("Invalid age")
    }
}