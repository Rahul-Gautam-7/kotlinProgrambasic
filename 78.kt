fun main() {
    var n=5
   for (i in 0 .. n)
   {
       for (j in 0 .. n)
       {
           if(i==0 || j==0 || i== n || j== n)
           {
               print("*")
           }
           else
           {
               print(" ")
           }

       }
       println()
   }
}