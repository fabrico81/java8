package java8.certification.ocp.chapter_2.Polymorphism;

public class Whale implements LiveInOcean {
    @Override
    public void makeSound() {
        System.out.println("Sing");
    }
}
