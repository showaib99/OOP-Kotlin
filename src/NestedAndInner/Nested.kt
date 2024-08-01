package NestedAndInner

class Outer {
    var name:String = "Ziaur Rahman"
    class Nested{
        var showaib = Outer() //Important line for Nested Class

        fun display(){
            println(showaib.name)
        }
    }
}

fun main(args: Array<String>) {
    var out = Outer()
    var nested = Outer.Nested()
    nested.display()
}