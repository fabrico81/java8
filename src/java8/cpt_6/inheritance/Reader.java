package java8.cpt_6.inheritance;

import java8.cpt_6.Book;

public interface Reader {
    default void read(Book book) {
        System.out.println("I am reading book = " + book.getTitle());

    }
}
