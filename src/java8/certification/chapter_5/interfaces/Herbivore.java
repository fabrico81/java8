package java8.certification.chapter_5.interfaces;

/**
 * @author faber
 */

public interface Herbivore {
    public int eatPlants(int quantity);

    static void eat() {
        System.out.println(" eat");
    }
}
