package Abstruct

class Student:Person() {
    override var name: String = ""
    override var age: Int = 0
    override var gender: String = ""

    override fun work() {
        println("Studying...")
    }

}