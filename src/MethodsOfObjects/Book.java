package MethodsOfObjects;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название книги - " + bookName + ", " + authorName + ", Год издания - " + publisingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisingYear == book.publisingYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publisingYear);
    }
}
