package java8.certification.oca.chapter_4.lambdas;

/**
 * @author faber
 */

public interface CheckTrait {
    boolean test(Animal a);

    default void check(){

        System.out.println(" I am the owner");
    }

    default int check(int i) {
        return i;
    }
}
