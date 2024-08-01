package BasicOOP

class FruitClass{
    var name:String = ""
    var color:String = ""
    var size:Int = 0

    constructor(name:String){
        this.name = name
    }

    constructor(name:String, color:String){
        this.name = name
        this.color = color
    }

    constructor(name:String, color:String, size:Int){
        println("Name: $name, Color: $color, Size: $size")
    }
}