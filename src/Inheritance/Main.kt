package Inheritance

fun main() {
    var s = Student("Ali", 25, "Male", 1111)
    s.display()

    var t = Teacher("Kamal", 30, "Male", 1110, "Math")
    t.display()

    var b = BusinessMan("Showaib", 30, "Male", 500000)
    b.display()
}