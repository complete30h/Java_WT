package by.bsuir.lab1.task14;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book clone()
    {
        Book book = new Book();
        book.author = this.author;
        book.price = this.price;
        book.title = this.title;
        return book;
    }
}
