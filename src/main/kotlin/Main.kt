fun main(){
    sentence("“Barnie bakes brown bagels and buns")

    numbers(arrayOf(4, 7, 8, 2, 4))

    volume(9.98, 4, 8)
}

//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun sentence(text:String){
    println(text.removeSuffix("b"))
}


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
fun numbers(x:Array<Int>){
    var a = x.sum()
    println(a)

    var b = x.count()
    println(b)

    var c = x.sum() / x.count()
    println(c)
}


//The volume of a sphere is calculated using the formula below


//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun volume(a:Double, p:Int, r:Int){
    var y = a * p * r
    println(y)

}

//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun isPalindrome(word:String): Boolean{


}