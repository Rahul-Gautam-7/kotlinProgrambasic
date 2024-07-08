fun main() {
    print("Enter any one character : ")
    var str = readln()
    var lstr = str.lowercase()
    if (lstr == "a" || lstr == "e" || lstr == "i" || lstr == "o" || lstr == "u")
    {
        print("vowels")
    }
    else
    {
        println("It is a consonants")
    }
}