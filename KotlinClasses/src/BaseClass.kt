/**
 * Open keyword added explicitly to make this class derivable
 */
open abstract class BaseClass {

    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName + $lastName"   //Note: open to allow overriding this function
    abstract fun toName():String

}