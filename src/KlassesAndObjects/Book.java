package KlassesAndObjects;

public class Book {
    private String bookName;
    private Author authorName;
    private int publisingYear;

    public Book(String bookName, Author authorName, int publisingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisingYear = publisingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublisingYear() {
        return this.publisingYear;
    }

    public void setPublisingYear(int publisingYear) {
        this.publisingYear = publisingYear;
    }

}
