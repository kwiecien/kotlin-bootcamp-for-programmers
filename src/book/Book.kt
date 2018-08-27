package book

fun main(args: Array<String>) {
    val book = Book("TDD", "Beck", 1990)
    val (title, author, year) = book.getAllData()
    val bookTitleAuthor = book.getAllData()
    println("The best book: $title by $author (${bookTitleAuthor.third})")
}

open class Book(val title: String, val author: String, val year: Int) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }

    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getAllData(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author, 1) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}