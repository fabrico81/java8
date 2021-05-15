package java8.certification.ocp.chapter_2.ObjectReferences;

public class Capybara extends Rodent{

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = new Capybara(); /*(Capybara) rodent;  ClassCastException*/

        Rodent rodent1 = (Capybara) capybara;

    }
}
