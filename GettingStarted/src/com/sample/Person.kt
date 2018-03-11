package com.sample


class Person(var Name: String) {   //Constructor

    val NameOfTheClass = "Person"

    fun display() {
        println("From display Name is $Name")
    }

    fun displayWithLambda(call: (s: String) -> Unit) {
        call(Name)
    }

    fun displayWithLambda2(func: ()->Unit){
        func()
    }



}