package java8.certification.chapter_4.pond.swan;

import java8.certification.chapter_4.pond.duck.MotherDuck;

/**
 * @author faber
 */

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
     //   duck.quack(); // DOES NOT COMPILE
     //   System.out.println(duck.noise); // DOES NOT COMPILE
    } }
