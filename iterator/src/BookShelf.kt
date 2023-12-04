class BookShelf : Iterable<Book> {
    private val books = mutableListOf<Book>()
    private var index = 0

    fun add(book: Book) {
        books.add(book)
    }

    fun getLength(): Int = books.size

    fun getBookAt(index: Int): Book = books[index]

    override fun iterator(): Iterator<Book> =
        BookShelfIterator(this)
}