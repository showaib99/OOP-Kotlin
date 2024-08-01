package NestedAndInner

class Inner {
    var name:String = "Mushfiqur Rahman"
    inner class Inner{

        fun display(){
            println(name)
        }
    }
}


fun main(args: Array<String>) {
    var out = Inner()
    var inner = out.Inner()
    inner.display()
}