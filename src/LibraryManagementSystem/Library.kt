package LibraryManagementSystem

abstract class Library {
    abstract fun addBook(book: Book) //Model Class
    abstract fun viewAllBooks()
    abstract fun findBookByAuthor(author:String)
}