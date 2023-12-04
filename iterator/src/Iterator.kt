import java.time.LocalDateTime

fun main() {
    val book1 = Book("Iterator Pattern - 1")
    val book2 = Book("Iterator Pattern - 2")
    val book3 = Book("Iterator Pattern - 3")

    val bookShelf = BookShelf()

    bookShelf.add(book1)
    bookShelf.add(book2)
    bookShelf.add(book3)

    val bookIterator = bookShelf.iterator()

    while (bookIterator.hasNext()) {
        val book = bookIterator.next()
        println(book.name)
    }

    val now = LocalDateTime.now()

    println(now.plusDays(30))
}