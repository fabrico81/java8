package java8.certification.oca.chapter_5.zoo;

/**
 * @author faber
 */

public class Kangaroo extends Marsupial {

    private int age;

     public boolean isBiped() {
        return false;
    }
    public void getKangarooDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }

    protected int getAge() {
         return this.age;
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

    }
}
