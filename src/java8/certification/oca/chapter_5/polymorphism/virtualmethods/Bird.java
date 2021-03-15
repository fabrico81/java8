package java8.certification.oca.chapter_5.polymorphism.virtualmethods;

/**
 * @author faber
 */

public class Bird {

    public String getName() {
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
}
