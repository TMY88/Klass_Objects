package MethodsOfObjects;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и Мир", author1, 1867);
        System.out.println("Название книги - "+book1.getBookName());
        System.out.println("Автор книги - " + author1.getNameAuthor()+" "+author1.getSurnameAuthor());
        System.out.println("Год издания - " + book1.getPublisingYear());

        Author author2 = new Author("Федр", "Достоевский");
        Book book2 = new Book("Преступление и наказание", author1, 1866);
        System.out.println("Название книги - "+book2.getBookName());
        System.out.println("Автор книги - " + author2.getNameAuthor()+" "+author2.getSurnameAuthor());
        System.out.println("Год издания - " + book2.getPublisingYear());
        book2.setPublisingYear(2001);
        System.out.println("Год издания - " + book2.getPublisingYear());
        System.out.println();

        //new tasks
        System.out.println(book1.getAuthorName());
        Author author3 = new Author("Лев", "Толстой");
        System.out.println(author1.equals(author3));
        Author author4 = new Author("Лев", "Худой");
        System.out.println(author1.equals(author4));

        System.out.println(book1);
        Book book3 = new Book("Война и Мир", author1, 1867);
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book2));
    }

}
