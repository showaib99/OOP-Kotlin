package LibraryManagementSystem

fun main(args: Array<String>) {
    var publicLibrary = PublicLibrary()

    publicLibrary.addBook(Book("Think and Grow Rich", "J.J.R", 1935))
    publicLibrary.addBook(Book("The Miracle Morning", "Joss Whedon", 1980))
    publicLibrary.addBook(Book("Android Development with Kotlin", "Showaib Alam", 2025))

    println("*********************** All Books **********************************")
    publicLibrary.viewAllBooks()

    println("*********************** Find Books By Author ***********************")
    publicLibrary.findBookByAuthor("Showaib Alam")
}