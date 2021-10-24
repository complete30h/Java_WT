package by.bsuir.lab1.task13;

import by.bsuir.lab1.task12.Book;
public class ProgBook extends Book {
    private String language;
    private int level;

    public ProgBook(int price, String title, String author, String language, int level) {
        super(price, title, author);
        this.language = language;
        this.level = level;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass()) {
            return false;
        }

        ProgBook progBook = (ProgBook) obj;
        if (language != progBook.language) {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        return 31 * super.hashCode() + language.hashCode();
    }

    public String toString()
    {
        return getClass().getName() + super.toString() + ",language" + language + ",level" + level;
    }
}
