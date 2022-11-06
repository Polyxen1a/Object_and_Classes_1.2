public class Book {
    private final String bookName;
    private final Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int setPublishYear(int publishYear) {
        this.publishYear = publishYear;
        return publishYear;
    }
    public String toString() {
        return bookName + " " + author.toString() + " " + publishYear + " ";
    }
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return bookName.equals(book1.bookName) && author.equals(book1.author) && publishYear == book1.publishYear;
    }
    public int hashCode() {
        return java.util.Objects.hash(bookName, publishYear, author);
    }
}