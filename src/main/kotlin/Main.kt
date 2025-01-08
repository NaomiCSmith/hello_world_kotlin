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

    // Write a method called superify which takes a string and adds the word "super" to the start.
    // So given 'woman' it returns 'superwoman', given 'dog' it returns 'superdog'.
    //Then use it to create the ultimate feline superhero, like this:
    //
    //println(superify(superify(superify(superify("cat")))))
    //
    // Should print:
    //"supersupersupersupercat"

    fun superify(name: String): String {
        return "super${name}"
    }
    println(superify("Kat"))
    println(superify(superify("michael")))
    println(superify(superify(superify(superify("cat")))))

    // Define a function revealSecret which takes a passcode in argument, and returns a secret string
    // "The cookies are in the desk drawer" only if the given passcode is the string "HUNGRY".
    //If the given passcode is something else, the function should return null.
    //You will need to use an if statement to implement this function.
    //
    //val secret = revealSecret("HUNGRY")
    //println(secret) // "The cookies are in the desk drawer"
    //
    //val secret = revealSecret("Hi")
    //println(secret) // null

    fun revealSecret( password: String ): String? {
        return if (password == "HUNGRY") {
            "The cookies are in the desk drawer"
        } else {
            null
        }
    }
    println(revealSecret("HUNGRY"))
    println(revealSecret("food please"))

    // Define a function getNumberSign that takes a number and returns a String which is either "zero",
    // "positive" or "negative" depending on its sign. If the argument is not a number, the function
    // should return null.

    fun getNumberSign (number: Int): String {
        val result =
            if (number < 0) {
                "negative"
            } else if (number > 0) {
                "positive"
            } else {
                "zero"
            }
        return result
    }

    println(getNumberSign(1))
    println(getNumberSign(-3))
    println(getNumberSign(0))


}