package java8.certification.oca.chapter_5.polymorphism.virtualmethods;

/**
 * @author faber
 */

public class Peacock extends Bird {


    public String getName() {
        return "Peacock";
    }
    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
        Bird bird1 = new Bird();
        bird1.displayInformation();
    }
}
