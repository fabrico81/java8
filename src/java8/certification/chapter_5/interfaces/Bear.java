package java8.certification.chapter_5.interfaces;

/**
 * @author faber
 */

public class Bear implements Omnivore, Herbivore {

    public void eatMeat() {
        System.out.println("Eating meat");
    }
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    public static void eat(String season) {
        System.out.println("Eat in " + season);
    }

    @Override
    public int eatPlants(int quantity) {
        return 0;
    }

    public boolean isEating(boolean answer) {
        return true;
    }

    public static void main(String args []) {


    }
}
