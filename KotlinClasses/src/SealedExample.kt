import java.awt.Event

/**
 * Sealed classes restrict hierarchies
 *  Sub classes of sealed classes must be defined in the same file as sealed class
 *
 *  TODO: explore more
 */
sealed class SealedExample {

    class Example1 : SealedExample()
    class Example2 : SealedExample()
    class Example3(val example:String) : SealedExample();

}

fun handleExample(type:SealedExample){
    when(type){
        is SealedExample.Example1 -> println("Example 1")
        is SealedExample.Example2 -> println("Example 2")
        is SealedExample.Example3 -> println("Example 3 $type")
    }
}