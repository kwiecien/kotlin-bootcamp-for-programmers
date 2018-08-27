package book

import java.util.*

class Book2(var pages: Int)

fun Book2.weight() = pages * 1.5
fun Book2.tornPages(count: Int) {
    pages -= count
}
fun Book2.isDestroyed() = pages <= 0

class Puppy {
    fun playWithBook(book: Book2) {
        book.tornPages(Random().nextInt(40))
    }
}

fun main(args: Array<String>) {
    val puppy = Puppy()
    val book = Book2(1000)
    while (!book.isDestroyed()) {
        puppy.playWithBook(book)
        println(book.pages)
    }
    println(book.pages)
}