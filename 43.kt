fun main() {
    print("Enter your data of power consumed : ")
    var data= readln().toFloat()
    if(data>0 && data<=200)
    {
        println("You have to pay ${data*0.50} Rs.")
    }
    else if (data>200 && data<=400)
    {
        println("You have to pay ${data*1.65} Rs.")
    }
    else if(data>400 && data<=600)
    {
        println("You have to pay ${data*(230+0.85)} Rs.")
    }
    else if (data>600)
    {
        println("You have to pay ${data*(391)} Rs.")
    }
    else
    {
        println("Invalid input")
    }
}