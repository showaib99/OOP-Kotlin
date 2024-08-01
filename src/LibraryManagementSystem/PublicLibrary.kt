package LibraryManagementSystem

class PublicLibrary:Library() {
    private var books = mutableListOf<Book>() //<Book> is Generic
    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun viewAllBooks() {
        for(book in books){
            println("Title: ${book.title}")
            println("Author: ${book.author}")
            println("Year: ${book.year}\n")
        }
    }

    override fun findBookByAuthor(author: String) {
        for (book in books){
            if(book.author == author){
                println("Title: ${book.title}")
                println("Author: ${book.author}")
                println("Year: ${book.year}")
            }
        }
    }
}