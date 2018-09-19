package java8.cpt_6.inheritance;

public class Guitarist implements SoloistBlues, SoloistRock {

    public void doSolo() {
        SoloistRock.super.doSolo();
        SoloistBlues.super.doSolo();
    }

    public static void main(String []args){
        Guitarist guitarist = new Guitarist();
        guitarist.doSolo();
    }
}
