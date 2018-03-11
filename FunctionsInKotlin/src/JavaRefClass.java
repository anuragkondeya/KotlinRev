
//Demonstrates calling kotlin from java

public class JavaRefClass {

    public static void main(String[] args) {

          //MainKt.functionWithParams("Hello world");  //Note KT is prefixed to kotlin class's name
        // To make the above code work, remove the annotation @file:JvmName("KotlinClass") from Main.kt
          KotlinClass.functionWithParams("Steve Java");

          KotlinClass.demoDefaultParmas("Betty Java",32);  //Normal call
        KotlinClass.demoDefaultParmas("David Java");  //Overload call, check JVMOverloads in kotlin class
    }

}
