package daniel.salas.kotlinbasics


fun main(){
    /*
    //val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
    //val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)

    print(numbers.contentToString())
    for (element in numbers){
        print(" ${element+2}")
    }
     */
    /*
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3, true, false , "String")
    //println(anyTypes.size)
    for (month in months){
      //  println(month)
    }
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    val remainingMonths = arrayOf("August", "September", "October", "November", "December")
    additionalMonths.addAll(remainingMonths)
    println(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sun"
    days.removeAt(1)
    print(days)
     */
    /*
    val fruits = setOf("Orange", "Apple", "Grape", "Mango","Apple", "Orange")
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    //println(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday", 3 to "Wednesday")
    for (key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit("Grape", 2.5), "Ok" to Fruit("Apple", 1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    print(newDaysOfWeek.toSortedMap())
     */

    

}

//data class Fruit(val name: String, val price: Double)