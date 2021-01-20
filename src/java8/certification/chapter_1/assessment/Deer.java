package java8.certification.chapter_1.assessment;

public class Deer {


    public Deer() { System.out.print("Deer"); }
    public Deer(int age) { System.out.print("DeerAge"); }
    boolean hasHorns() { return false; }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println(","+deer.hasHorns());
    }
}
class Reindeer extends Deer {
    public Reindeer(int age) { System.out.print("Reindeer"); }
    public boolean hasHorns() { return true; }
}
