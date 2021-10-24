package by.bsuir.lab1.task12;

import java.util.Comparator;

public class Book
{
    private String title;
    private String author;
    private int price;
    private static int edition;

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
        return result = 31 * result + author.hashCode();
    }
}
