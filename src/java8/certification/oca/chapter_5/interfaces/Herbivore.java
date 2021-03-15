package java8.certification.oca.chapter_5.interfaces;

/**
 * @author faber
 */

public interface Herbivore {
    int a = 0;



    static void eat() {
        System.out.println(" eat");
    }
}

interface HasWings{
public abstract Object getWindSpan();
}


abstract class Falcon implements Herbivore, HasWings {

}
