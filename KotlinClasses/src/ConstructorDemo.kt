/**
 * Initialise default constructor
 */
class ConstructorDemo(name:String) {
val name:String
    init{
        this.name = name  // this will create a property in the class
    }

}

/**
 * Another method
 */
class ConstructorDemo2(_name:String){
    val name = _name                  // init _name to name
}

/**
 * Preferred way
 */
open class ConstructorDemo3(name:String){
    var _age:Int = 0

    constructor(name:String, age:Int):this(name){
        this._age = age
    } //Secondary constructor, this(name) is making a call to primary constructor
}

