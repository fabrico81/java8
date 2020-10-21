package java8.lambdaexpressions;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args){
        printPersonsOlderThan(Person.createRoster(), 27);
        printPersonsWithinAgeRange(Person.createRoster(), 20, 47);
        printPersons(Person.createRoster(), new CheckPersonEligibleForSelectiveService());

    }


    /* Approach 1: Create Methods That Search for Members That Match One Characteristic
     **
     *
     */


    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    /*
     * Approach 2: Create More Generalized Search Methods
     *
     */
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    /*
     *
     *
     *  Approach 3: Specify Search Criteria Code in a Local Class
     */

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    /**
     *
     *    Approach 4: Specify Search Criteria Code in an Anonymous Class
     */


   /* public static void printPersonsAnonymous( Person roster, new CheckPerson() {
        public boolean test(Person pe) {
            return pe.getGender() == Person.Sex.MALE
                    && pe.getAge() >= 18
                    && pe.getAge() <= 25;
        }
    });*/


    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

}
