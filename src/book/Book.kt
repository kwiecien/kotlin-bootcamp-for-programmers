package book

const val MAX_NUMBER_OF_BOOKS = 5

fun main(args: Array<String>) {
    pairsAndTriples()
    collections()
    constants()
}

fun constants() {
    val book = Book("TDD", "Beck", 1990)
    book.printlnUrl()
}

fun collections() {
    val allBooks = setOf("Makbet", "Hamlet")
    val library = mapOf(allBooks to "Shakespeare")
    println(library.any { it.key.contains("Hamlet") })

    val moreBooks = mutableMapOf("Winnetou" to "May")
    println(moreBooks)
    moreBooks.getOrPut("Harry Potter") {"Rowling"}
    println(moreBooks)
}

fun pairsAndTriples() {
    val book = Book("TDD", "Beck", 1990)
    val (title, author, year) = book.getAllData()
    val bookTitleAuthor = book.getAllData()
    println("The best book: $title by $author (${bookTitleAuthor.third})")
}

open class Book(val title: String, val author: String, val year: Int) {

    private var currentPage = 1

    object Constants {
        const val BASE_URL = "http://turtlecare.net"
    }

    companion object {
        const val BASE_URL = "http://turtlecare.net"
    }

    open fun readPage() {
        currentPage++
    }

    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getAllData(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return hasBooks < MAX_NUMBER_OF_BOOKS
    }

    fun printlnUrl() {
        println(Constants.BASE_URL + title + ".html")
        println("$BASE_URL$title.html")
    }

}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author, 1) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}