package Vahicle

class VahicalClass(var model:String, var brand:String, var engine:String, var seat:Int, var madeIn:String) {
    init {
        println("Model: $model")
        println("Brand: $brand")
        println("Engine: $engine")
        println("Seat: $seat")
        println("MadeIn: $madeIn")
    }
    fun horn() {
        println("Sound is Pip pip pip")
    }
}