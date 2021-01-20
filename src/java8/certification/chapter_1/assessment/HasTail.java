package java8.certification.chapter_1.assessment;


interface HasTail {
    int getTailLength(); }
/*
abstract class Puma implements HasTail {
    public int getTailLength() {return 4;} // cannot override as protected
}
public class Cougar extends Puma {

    public static void main(String[] args) {
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
    }

   // public int getTailLength(int length) {return 2;}
}
*/