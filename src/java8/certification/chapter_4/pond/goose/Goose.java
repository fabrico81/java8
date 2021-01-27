package java8.certification.chapter_4.pond.goose;

import java8.certification.chapter_4.pond.shore.Bird;

/**
 * @author faber
 */

public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
      //  other.floatInWater(); // DOES NOT COMPILE
      //  System.out.println(other.text); // DOES NOT COMPILE
    } }
