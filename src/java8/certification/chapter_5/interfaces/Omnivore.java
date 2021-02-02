package java8.certification.chapter_5.interfaces;

/**
 * @author faber
 */

public interface Omnivore {
    public void eatPlants();
    public void eatMeat();

    default boolean isEating(boolean answer){
        return answer;
    }

    public int eatPlants(int quantity);

    static void eat() {
        System.out.println(" eat");
    }
}
