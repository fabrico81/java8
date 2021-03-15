package java8.certification.oca.chapter_4.lambdas;

/**
 * @author faber
 */

public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}
