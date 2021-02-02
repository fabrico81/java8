package java8.certification.chapter_5.abstracclass;

/**
 * @author faber
 */

public abstract class Animal {

    int age;
    private int animalClass;

    abstract protected String getName();

    public int getAnimalClass() {
        return animalClass;
    }

    public void setAnimal(int animalClass) {
        this.animalClass = animalClass;
    }
}
