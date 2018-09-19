package java8.cpt_6.inheritance;

public interface Soloist {

    default void doSolo() {
        System.out.println("DO RE MI FA SOL LA SI");
    }
}
