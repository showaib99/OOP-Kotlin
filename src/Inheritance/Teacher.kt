package Inheritance

class Teacher(name:String, age:Int, gender:String, var teacherId:Int, var subject:String):Person(name, age, gender) {
    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Teacher ID: $teacherId")
        println("Subject: $subject\n")
    }
}