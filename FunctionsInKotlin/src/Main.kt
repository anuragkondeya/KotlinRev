@file:JvmName("KotlinClass")

import java.math.BigInteger

fun main(args: Array<String>) {
    functionWithNoParams()
    val ret = functionWithParams("Steve")
    println(ret)
    println("Max numbers is ${max(3, 4)}")
    demoDefaultParmas("Bob", 10) //Param specified
    demoDefaultParmas("Ben") //No param specified
    demoNamedParams(name = "Sully", gender = "male", age = 23)  //Names params Note: calling order is changed

    val message = "This              is           a           line "
    message.replaceMultipleWhiteSpace();  //Note: Extension function being called as standard function of String class

    //Infix demo

    val h1 = Header("H1")
    val h2 = Header("H2")

    // Without infix, function is called with dot operator
    val h3 = h1.plusWithoutInfix(h2)
    println(h3.name)

    val h4  = h1 plus h2  //Infix class Note no dot operator is required
    println(h4.name)

    val h5  = h1 + h2  //operator overloading
    println(h5.name)

    val numLarge = 10000
    val num = 500;


    println(fibWithoutTailRec(num, BigInteger("1"),BigInteger("0"))) //NumLarge will trigger a stack overflow here

    println(fib(numLarge, BigInteger("1"),BigInteger("0")))  //No Stack overflow here
}


/**
 * Function expression
 */
fun functionWithNoParams() = println("Hello")

/**
 * Function expression example 2
 */
fun max(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

fun functionWithParams(message: String): Boolean {  //Note return type boolean
    println("hello $message")
    return true
}

@JvmOverloads  //Check caller in java class
fun demoDefaultParmas(name: String, age: Int = 0) {  //Note default parameter
    println("Hello $name. Your age is $age")
}

fun demoNamedParams(name: String, age: Int, gender: String) {
    println("$name is $age years old and is a $gender")
}

/**
 * Extension function are to add functionality to classed which we didnt write
 * Cutdown on utility classes
 * Easy to read code, extension functions looks like normal functions to the class
 */

fun String.replaceMultipleWhiteSpace(): String {  //Note String. before function name or marking extension function, Also note use of "this"
    var regex = Regex("\\s+")
    return regex.replace(this," ");
}


