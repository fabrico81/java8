package java8.cpt_6.inheritance;

import java8.cpt_6.Book;

public class TestMultipleInheritance {

    public static void main(String [] args){
        WhoReading whoReading = new WhoReading();
        Book book = new Book("Java 8", "Hoepli");

        whoReading.read(book);
        whoReading.software("Java");
    }
}
