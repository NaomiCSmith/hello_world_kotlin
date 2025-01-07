package org.example

fun main() {
    println("Hello World!")

    // Exercises:

    // Define a String message and assign the reversed version of it to a new value.
    val message = "I am a message"
    val reversedMessage = message.reversed()
    println(reversedMessage)

    //  The following code doesn't work - why? Modify it so it runs.
    //    val aNumber = 2
    //    aNumber = 4
    var aNumber = 2
    aNumber = 4
    println(aNumber)

    // The following code doesn't work - why? Modify it so it runs.
    // val numbers: List<Number> = listOf(3, 4, null)
    val numbers: List<Number?> = listOf(3, 4, null)
    println(numbers)

    // The following code doesn't work - why? Modify it so it runs.
    //val otherNames: List<String?> = listOf("Kat", "Marc", null)
    //
    //// Loop on each name in the list
    //for (name in otherNames) {
    //    // Print the length
    //    println(otherNames.length)
    //}
    val otherNames: List<String?> = listOf("Kat", "Marc", null)
    // Loop on each name in the list
    for (name in otherNames) {
        // Print the length
        if (name != null) {
            println(name.length)
        }
    }

    // The following code doesn't work - why? Modify it so it runs.
    // val number = "3" as Number
    val number = "3".toInt()
    println(number)

    // How to fix the following code so
    // we can create a list of both strings and numbers?
    // val listOfThings: List<Int> = listOf(3, "Hello", 4)
    val listOfThings: List<Any> = listOf(3, "Hello", 4)
    println(listOfThings)








}