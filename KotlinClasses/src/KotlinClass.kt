/**
 * Kotlin classes are public and final by default.
 * internal keyword makes classes visible in a module
 * kotlin doesnt have package private
 *
 *
 */
 class KotlinClass : BaseClass() {
    override fun toName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): String {
        return super.getName()
    }
}

fun main(args:Array<String>){

}