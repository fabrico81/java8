package java8.certification.chapter_5.zoo;

import java8.certification.chapter_5.zoo.fish.Fish;

/**
 * @author faber
 */

public class Shark extends Fish {

    private int numberOfFins = 8;
    private int age;

    public Shark() {
        super(4);
        this.size = 4;

    }

    public int getAge() {
        return 20;
    }


    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }
}
