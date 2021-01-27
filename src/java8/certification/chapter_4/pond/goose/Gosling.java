package java8.certification.chapter_4.pond.goose;

import java8.certification.chapter_4.pond.shore.Bird;

/**
 * @author faber
 */

public class Gosling extends Bird { // extends means create subclass
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    } }