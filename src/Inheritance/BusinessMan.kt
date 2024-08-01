package Inheritance

class BusinessMan(name:String, age:Int, gender:String, var annualIncome:Int):Person(name, age, gender) {
    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Annual Income: $annualIncome")
    }
}