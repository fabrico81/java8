package java8.certification.oca.chapter_4.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author faber
 */

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
 //       print(animals, new CheckIfHopper()); // pass class that does check
        print(animals, a -> a.canHop());
    }
    private static void print(List<Animal> animals, CheckTrait checker) {
/*
        animals.forEach(animal -> {
            if(checker.test(animal))
                System.out.println(animal+ " ");
        });
*/

        animals.stream().
                filter(animal -> checker.test(animal))
                .forEach(System.out::println);


/*
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
        */
    }
}
