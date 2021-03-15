package java8.certification.oca.chapter_5.polymorphism;

/**
 * @author faber
 */

public class Lemur extends Primate implements HasTail {

    @Override
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());



        Lemur lemur1 = new Lemur();
        Primate primate1 = (Primate) lemur1;

        System.out.println(lemur1.hasHair());
    }
}
