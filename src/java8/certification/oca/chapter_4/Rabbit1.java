package java8.certification.oca.chapter_4;

/**
 * @author faber
 */

public class Rabbit1 {

    private static final String leftRope;
    private static final String rightRope;
   // private static final String bench;
    private static final String name = "name";
    static
    {
        leftRope = " left";
        rightRope = " right";
    }
    static {
  //      name = "name";
   //     rightRope = "right";
    }

     static Rabbit rabbit1 = new Rabbit();
     static Rabbit rabbit2 = new Rabbit();

    {
        System.out.println(rabbit1.count);
    }



    public static void main(String []args) {

    //    bench = "bench";

        rabbit1.count = 2;
        rabbit2.count = 8;
        rabbit1.count = 2;
        System.out.println(rabbit1.count);
    }



}
