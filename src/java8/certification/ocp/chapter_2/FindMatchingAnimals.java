package java8.certification.ocp.chapter_2;

public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }
    public static void main(String[] args) {
        print(new Animal("fish", false, true), a  ->  a.canHop()); // (Animal a) -> { return a.canHop(); }
        print(new Animal("kangaroo", true, false), a -> a.canHop());
    }
}
