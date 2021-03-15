package java8.certification.oca.chapter_5.zoo;

/**
 * @author faber
 */

public class Marsupial {

    private int age;

    private boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }

    private int getAge() {
        return this.age;
    }
}
