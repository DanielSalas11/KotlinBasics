package daniel.salas.kotlinbasics

import java.lang.IllegalArgumentException

data class User(val id: Long, var name: String)

//fun main(){
/*
    //print("First character $firstChar and the length of myStr is ${myString.length}")

    //Arithmetic operators (+, -, *, /, %)
    val a =5.0f
    val b = 3.0f
    var resultDouble : Double= (a / b).toDouble()
    print(resultDouble)


    val isEqual = 5==5
    //println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    //println("isNotEqual is $isNotEqual")
    //println("is5greater3 ${5>3}")
    //println("is5LowerEqual3 ${5<=3}")



    var age = 15

    when(age){
        in 21.. Int.MAX_VALUE -> print("You can drink")
        in 18..20 -> print("You can vote")
        16,17-> print("You can drive")
        else -> print("Too young")
    }

    when{
    age >= 21 -> println("You can drink")
    age >= 18 -> println("You can vote")
    age >= 16-> println("You can drive")
    else -> println("Too young")
    }

    var x : Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> print("$x is none of the above")
    }


    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 6
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
        else -> print("Invalid Season")
    }



    var x = 100
    while (x >= 0){
        println(x)
        x -= 2
    }
    println("\nwhile loop is done")

     x=15

    do{
        println(x)
        x++
    } while(x <= 10)
    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold"){
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    for (i in 10 downTo 1 step 2){
        println("$i")
    }

    for(i in 0..10000){
        //println(i)
        if (i == 9001)
            println("IT'S OVER 9000")
    }

    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid"){
        humidityLevel -= 5
        println("Humidity decreased.")
        if (humidityLevel <= 60){
            println("It's comfy now")
            humidity = "comfy"
        }
    }




    for (i in 1 until 20){
        if (i/2 == 5){
            continue
        }
        print("$i ")
    }
    print("Done with the loop")


     */
/*
    myFunction()
    myFunction()
    var result = addUp(10,20)
    println("result is $result")
    println("average is ${average(5f,10f)}")

    var nullableName : String? = "Denis"
    //nullableName = null


    val name = nullableName ?: "Guest"
    //println("name is $name")

    println(nullableName!!.toLowerCase())
 */
/*
    var me = Person("Daniel","Salas")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")

    var iPhone10 = MobilePhone("iOS","Apple","iPhone10")
    var honor20 = MobilePhone("Android","Huawei","Honor")
    iPhone10.chargeBattery(30)

 */
/*
    var ramon = Person("Ramon", "Gonzalez", 34)
    ramon.hobby = "cooking"
    ramon.stateHobby()

 */


/*
var myCar = Car()
    println("brand is: ${myCar.myBrand}")
 */
    /*
    val user1 = User(1,"Dennis")

    user1.name = "Michael"
    val user2 = User(1,"Michael")
    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Denis Panjuta")
    println(updatedUser)

    println(updatedUser.component1())
    println(updatedUser.component2())

    val(id,name) = updatedUser
     */
/*
fun addUp(a: Int, b: Int) : Int{
    return a+b
}

fun average(a: Float, b: Float) : Float{
    return (a+b)/2
}

fun myFunction(){
    print("Called from myFunction")

}
 */

open class Car(val name: String, val brand: String){
    open var range: Float = 0.0f

    fun extendRange(amount: Float){
        if (amount > 0)
            range += amount
    }

    open fun drive(distance: Float){
        println("Drove for $distance km")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Float) : Car(name,brand){
    override var range = batteryLife * 6f
    var chargerType = "Type1"

    override fun drive(distance: Float) {
        println("Drove for $distance KM on electricity.")
        }

    fun drive(){
        println("Drove for $range KM on electricity.")
    }
    }

fun main(){
    var nissanSentra = Car("Sentra", "Nissan")
    var teslaS = ElectricCar("S-Model","Tesla", 85.0f)

    teslaS.extendRange(200f)
    nissanSentra.drive(200f)
    teslaS.drive(200f)
    teslaS.drive()
    teslaS.chargerType = "Type2"
}

/*
class Car(){
    lateinit var owner : String

    val myBrand: String = "BMW"

    get(){
        return field.lowercase()
    }

    var maxSpeed: Int = 250
        set(value){
            field = if (value > 0) value else throw IllegalArgumentException("Max speed cannot be lower than 0.")
        }

    var myModel : String = "M5"
        private set

    init {
        this.owner = "Frank"
    }
}

class Person(firstName: String = "John", lastName: String = "Doe"){
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName: String? = null
    init {
        this.firstName = firstName
        println("Initialized a new person whose name is $firstName and last name is $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int)
        : this(firstName,lastName){
            this.age = age
            println("Initialized a new Person object with, name $firstName, last name $lastName and age $age")
    }

    fun stateHobby(){
        println("$firstName's hobby is $hobby")
    }
}

class MobilePhone(osName: String = "Unknown", brand: String= "Unknown", model: String= "Unknown"){
private var battery = 30
    init {
        println("Here the osName is $osName, brand is $brand, model is $model, battery is $battery")
    }

    fun chargeBattery(chargedBy:Int){
        println("Past phone's battery: $battery")
        println("Current phone's battery: ${battery + chargedBy}")
    }
}

 */