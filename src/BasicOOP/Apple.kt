package BasicOOP

fun main(){
    var apple = FruitClass("Apple", "Green", 3)

    var orange = FruitClass("Orange", "Green")
    println("Name: ${orange.name}")
    println("Color: ${orange.color}")

    var banana = FruitClass("Banana")
    println("Name: ${banana.name}")
}