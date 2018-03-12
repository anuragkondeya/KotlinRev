import java.time.LocalDateTime

/**
 * Kotlin interface support default menthods
 */
interface Time {

    fun setTime(hours:Int,mins:Int = 0,seconds:Int = 0)

    /**
     * Default implementation
     */
    fun defaultTime(){
        println(LocalDateTime.now())
    }
}
