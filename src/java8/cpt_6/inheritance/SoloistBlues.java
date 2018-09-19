package java8.cpt_6.inheritance;

public interface SoloistBlues extends Soloist {

    default void doSolo() {
        System.out.println("Do MIb FA SOLb SOL SIb DO");
    }
}
