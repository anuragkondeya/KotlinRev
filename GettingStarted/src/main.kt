import com.sample.Person
import java.util.*

fun main(args: Array<String>) {

    var student = Person("Bob")  // Constructor  Note: there is no new keyword

    println("Name of the student is ${student.Name}")

    student.Name = "David"

    student.display();

    //Name is public as public is default behavior

    student.displayWithLambda2(::helloWorldMessage)

    student.displayWithLambda { printName("Matt") }


    //student.NameOfTheClass = "Person"  Error: as val is final and cannot be reinitialise

    println("Name of the student class is  ${student.NameOfTheClass}")  //String interpolation ie variable inside a String

    sampleIF(false)

    sampleNullability()

    sampleWhen("Bob")

    sampleFor()

}

fun helloWorldMessage() {
    println("Hello World");
}


fun printName(name: String) {
    println("Name $name is printed from printName function ")
}

/**
 * Note that is can return a value(or variable), unlike java where it returns boolean
 * With this we can achieve immutability for the return of if comparision
 */
fun sampleIF(answer: Boolean) {
    val message: String? = if (answer) "answer is true"
    else "answer is false"
    println(message)
}

fun sampleNullability() {
    var person: Person? = Person("Steve")  //Shows value can be null
    person?.display()

    person = null

    println("${person?.Name}")

    //null safe if
    if (person?.Name == "Steve") {
        println("This line wont print as the condition wont be check as person is null")
    }
}

fun sampleFor() {

    var myValues =  listOf(1,2,3,4,5)

    for(i in myValues) print("$i ")
    println()

    for(i in 50 .. 60 step 2) print("$i ")  //Note range
    println()

    for(i in 10 downTo  0) print("$i ")
    println()

    for(i in 1 until 10) print("$i ") //Half closed range if for(i=0;i<10;i++), wont print 10
    println()

    //Iterate over a tree map
    var ages = TreeMap<String, Int>()
    ages["Apple"] = 10
    ages["Mango"] = 5
    ages["Cherry"] =15

    for((name, age) in ages){
        println("$name -- $age")
    }


    //Iterating with index Note use of withIndex
    for((index, element) in myValues.withIndex()){
        println("$index -- $element")
    }


}

fun sampleWhen(name: String) {
    val number = 6;

    when (name) {
        "Steve" -> println("Student  1")
        "David" -> println("Student 3")
        "Bob" -> println("Student 2")
        else -> print("Not a student")
    }
    when (number) {
        in 2..6 -> println("range 1")
        in 7..10 -> println("range 2")
        in -3..-6 -> println("out of range")  //TODO: check for negative ranges and why it is not working here
    }


    /**
     * Similar to if, try returns value
     */
    val number2: Int? = try {
        Integer.parseInt("kate")
    } catch (e: NumberFormatException) {
        null
    }

    println(number2)

}