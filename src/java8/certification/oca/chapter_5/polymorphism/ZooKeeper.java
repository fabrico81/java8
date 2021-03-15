package java8.certification.oca.chapter_5.polymorphism;

import java8.certification.oca.chapter_5.Gorilla;

/**
 * @author faber
 */

public class ZooKeeper {

    public static void main(String [] args) {
        Animal animal = new Gorilla();
        Gorilla gorilla = (Gorilla) animal;
        System.out.println("Name:" + gorilla.getName());

    }
}
