import com.sun.org.apache.xml.internal.serialize.XMLSerializer
import com.sun.xml.internal.txw2.output.XmlSerializer

open class Student(id:Int, name:String){

    companion object{
        fun createUnderGrad(name:String) : UnderGrad{
            return UnderGrad(name)
        }
        fun createPostGrad(name:String) : UnderGrad{
            return UnderGrad(name)
        }
    }


}

class UnderGrad(name:String) : Student(1,name){


}

class PostGrad(name:String) : Student(1,name){


}



fun main(args:Array<String>){

    Student.createPostGrad("David")
    Student.createUnderGrad("Steve")

}