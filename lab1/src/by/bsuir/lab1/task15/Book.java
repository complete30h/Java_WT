package by.bsuir.lab1.task15;
import java.util.Comparator;
public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(int price, String title, String author)
    {
        this.price = price;
        this.title = title;
        this.author = author;
    }
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (null == obj)
        {
            return false;
        }

        if (getClass() != obj.getClass())
        {
            return false;
        }
        Book book = (Book)obj;
        if (price != book.price)
        {
            return false;
        }
        if (null == title)
        {
            return false;
        }
        else
        {
            if (!title.equals(book.title))
            {
                return false;
            }
        }
        if (null == author)
        {
            return false;
        }
        else
        {
            if (!author.equals(book.author))
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        return getClass().getName() + "@" + "price" + price + ",edition" + edition + ",title" + title + ",author" + author;
    }

    public int hashCode()
    {
        int result = 17;
        result = 31 * result + title.hashCode();
        return 31 * result + author.hashCode();
    }

    public int compareTo(Book o) {
        if (o == null)
            throw new NullPointerException();
        if (this.isbn - o.isbn > 0)
            return 1;
        if (this.isbn - o.isbn < 0)
            return -1;
        return 0;
    }

    public static Comparator<Book> byAuthor = (book1, book2) -> book1.author.compareToIgnoreCase(book2.author);
    public static Comparator<Book> byTitle = (book1, book2) -> book1.title.compareToIgnoreCase(book2.title);
    public static Comparator<Book> byPrice = Comparator.comparingInt(book -> book.price);
    public static Comparator<Book> byTitleThenAuthor = byTitle.thenComparing(byAuthor);
    public static Comparator<Book> byAuthorThenTitle = byAuthor.thenComparing(byTitle);
    public static Comparator<Book> byAuthorThenTitleThenPrice = byAuthor.thenComparing(byTitle).thenComparing(byPrice);
}
