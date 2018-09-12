package java8;


import java.util.Arrays;
import java.util.List;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is moved to the first place. For example, the rotation of array
 * A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 */
public class CyclicRotation {

    public static void main(String []args){
        int unOrderedArr[] = {3, 8, 9, 7, 6};
        int k = 3;
//        9, 7, 6, 3, 8
        cyclicRotation(unOrderedArr, k);
    }

    private static int[] cyclicRotation(int [] arr, int k){
        if (arr == null || k < 0) {
            throw new IllegalArgumentException("The array must be non-null and the order must be non-negative");
        }
        int offset = arr.length - k % arr.length;
        if (offset > 0) {
            for (int i = 0; i <  k; i++){
                for (int j = arr.length - 1; j > 0; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
        return arr;
    }
}
