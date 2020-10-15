package java8;


/**
 * @author faber
 */

public class Fibonacci {

    public static void main(String [] args) {

        System.out.println(" = " + fibonacci(4));

    }

    static int fibonacci( int n) {

        if (n < 1){
            return -1;
        }
        else if(n == 1 || n == 2) {
            return n-1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
