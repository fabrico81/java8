package java8.cpt_6.inheritance;

public interface SoloistRock  extends Soloist{

    default void doSolo() {
        System.out.println("DO RE MI SOL LA DO");
    }
}
