package daniel.salas.kotlinbasics

fun main(){
    //immutable variable
    // TODO: Add new functionality

    val myName = "Daniel"
    var myAge = 22
    //myName = "newDaniel"
    print("Hi my name is " + myName + "\n")

    val myString = "RandomString"
    var randomChar = myString[0]
    var lastChar = myString[myString.length -1]
    println(randomChar)
    println(lastChar)

    //Assigning values to their specific data type exercise:
    var courseName: String= "Android Masterclass"
    val thirtheenNumber: Float = 13.37F
    var twentyFive: Byte = 25
    var year: Short = 2020
    var longNumber: Long = 18881234567
    var buleano: Boolean = true
    var caracter: Char= 'a'

}