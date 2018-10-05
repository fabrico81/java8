package java8.codility;

/**
 * A binary gap within a positive integer N
 * is any maximal sequence of consecutive zeros that is surrounded
 * by ones at both ends in the binary representation of N.
 */

public class BinaryGap {

    public static void main(String [] args){

        System.out.println("binaryGap = " + binaryGap(1041));
    }

    private static int binaryGap(int n){
        int binaryGap = 0;
        boolean found_one = false;
        for (int j = 0; n > 0; n /= 2) {
            if (n % 2 == 0) {
                j++;
            } else {
                if (j > binaryGap && found_one == true){
                    binaryGap = j;
                }
                found_one = true;
                j = 0;
            }
        }
        return binaryGap;
    }
}
