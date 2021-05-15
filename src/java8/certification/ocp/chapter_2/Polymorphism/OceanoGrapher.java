package java8.certification.ocp.chapter_2.Polymorphism;

public class OceanoGrapher {

    public static void main(String[] args) {
// Accepting any object whose implements LiveInOcean
        OceanoGrapher og = new OceanoGrapher();
        og.checkSound(new Whale());
        og.checkSound(new Dolphin());
//An object takes many forms
        LiveInOcean inOcean = new Whale();
        System.out.println(inOcean.getClass());
        inOcean.makeSound();
        inOcean = new Dolphin();
        System.out.println(inOcean.getClass());
        inOcean.makeSound();

    }

    public void checkSound(LiveInOcean animal) {
        animal.makeSound();
    }
}
