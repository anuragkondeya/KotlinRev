class TimeImp : Time {
    override fun setTime(hours: Int, mins: Int, seconds: Int) {

    }

    /**
     * This is how we can override a default implementation
     */
    override fun defaultTime() {
        super.defaultTime() //This statement is not required. Added just to demonstrate interface
    }

}