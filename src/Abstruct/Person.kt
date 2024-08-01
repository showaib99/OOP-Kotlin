package Abstruct

abstract class Person {
    abstract var name:String
    open var age:Int = 0
    open var gender:String = ""

    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
    }
    abstract fun work()
}