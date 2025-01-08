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


    // Define a function printHelloMessages which, for each name in the list given in argument,
    // prints a hello message. You should use map in this function.

    fun printHelloMessages (names: List<String>) {
        names.map {println("Hello ${it}!")}
    }
    printHelloMessages(listOf("Naomi", "Michael", "Lucina"))


    // Use the function getNumberSign written in the previous section. Write a new function getAllNumberSigns
    // which takes an array of numbers (Int), and returns an array of the corresponding number signs.

    fun getAllNumberSigns(numbers : List<Int>): List<String> {
        return numbers.map{getNumberSign(it)}
    }

    println(getAllNumberSigns(listOf(-1, 3, -5, 0, 7)))
    println(getAllNumberSigns(listOf(6, -5, 0, 4, -2)))


    // Function that uses a function as an argument:

    fun calculate(a: Int, b: Int, calculateFunction: (Int, Int) -> Int): Int {
        return calculateFunction(a, b)
    }
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    println(calculate(2, 3, ::add)) // 2 + 3 = 5
    println(calculate(2, 4, ::multiply)) // 2 * 4 = 8


    // Implement a function convertToCaps which takes a string and returns the string converted to capital letters.

    fun convertToCaps(string: String): String {
        return string.uppercase()
    }

    println(convertToCaps("Hello World!"))


    // Implement a function exclaim which takes a string and returns the given string with an exclamation mark at the end.

    fun exclaim(string: String): String{
        return "${string}!"
    }

    println(exclaim("Hello World"))


    // Implement a function greetWith which we can call this way:
    //greetWith("Marco", convertToCaps) // "MARCO"
    //greetWith("Marco", exclaim) // "Marco!"

    fun greetWith(string: String, adapt: (String) -> String): String {
        return adapt(string)
    }

    println(greetWith("I am tired", ::convertToCaps))
    println(greetWith("I am going on holiday", ::exclaim))


    // Using a lambda with greetWith instead of calling a function as argument:

    // lambda instead of exclaim:
    println(greetWith("I want to go to bed now", {string -> "${string}!"}))

    //lambda instead of convertToCaps:
    println(greetWith("I am ready for second breakfast.", {string -> string.uppercase()}))


    // using class Item and ShoppingBasket with example items

    val item = Item("Mars", 4.99)

    println(item.name) // 'Mars'
    println(item.price) // 4.99

    val cart = ShoppingBasket()
    println(cart.getTotalPrice()) // 0.0

    cart.addItem(item)

    println(cart.getTotalPrice()) // 4.99

    cart.addItem(Item("Skittle", 3.99))
    cart.addItem(Item("Skittle", 3.99))

    println(cart.getTotalPrice())

}