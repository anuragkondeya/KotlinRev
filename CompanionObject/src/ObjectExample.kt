/*
* Kotlin dont not  have static methods
* use keyword Object instead to create singleton
* Object keyword can create and init a class in one go
* Cant have a constructor
* */

/**
 * Using data class as it override the toString function
 */
data class SingleCourse(val id:Int,val Title:String){

}

object Courses{
    var allCourses = arrayListOf<SingleCourse>()
}


fun main(args:Array<String>){
    Courses.allCourses.add(SingleCourse(1,"Physics"))
    Courses.allCourses.add(SingleCourse(2,"Chem"))
    Courses.allCourses.add(SingleCourse(3,"Bio"))
    Courses.allCourses.add(SingleCourse(4,"Maths"))

    println(enrole("Maths"))
    println(enrole("data Science"))

}

fun enrole(courseName:String):SingleCourse?{
    return Courses.allCourses
            .filter {it.Title  == courseName}
            .firstOrNull()
}