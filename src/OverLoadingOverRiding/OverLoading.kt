package OverLoadingOverRiding

fun main() {


}

fun sum(x:Int, y:Int, z:Int){
    println(x+y+z)

}

fun sum(a:String, b:Int, c:Int){
    println(a+b+c)

}

fun sum(x:Double, y:Double):Double{
    return x+y
}