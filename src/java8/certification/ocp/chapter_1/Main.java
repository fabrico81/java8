package java8.certification.ocp.chapter_1;

public class Main {

    public static void main(String[] args) {

        HeavyAnimal heavyAnimal = new HeavyAnimal();
        Elephant elephant = new Elephant();
        Hippo hippo = new Hippo();
        boolean b1 = elephant instanceof HeavyAnimal;
        boolean b2 = elephant instanceof Mother;
        System.out.println(hippo.hashCode());
        System.out.println(hippo.getClass());
    }
}
