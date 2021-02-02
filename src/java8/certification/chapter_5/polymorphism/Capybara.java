package java8.certification.chapter_5.polymorphism;

/**
 * @author faber
 */

public class Capybara extends Rodent {


    public static void main(String[] args) {

        Capybara capybara = new Capybara();
        Rodent rodent1 = (Capybara) capybara;

        Rodent rodent = new Rodent();
        Capybara capybara1 = (Capybara)rodent; // Throws ClassCastException at runtime
    }
}

