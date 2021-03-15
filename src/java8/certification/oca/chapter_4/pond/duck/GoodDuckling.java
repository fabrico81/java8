package java8.certification.oca.chapter_4.pond.duck;

/**
 * @author faber
 */

public class GoodDuckling {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access
        System.out.println(duck.noise); // default access
    }
}
