package java8.exception;

/**
 * @author faber
 */

public class ThrowsException {


    public static void main(String [] args) throws ArithmeticException {

        try {
            System.out.println(1/0);


        }catch (ArithmeticException e) {

            System.out.printf("Catch");
        }

    }
}
