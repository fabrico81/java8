package java8.algorithms_datastructures;

import java.util.Arrays;

/**
 * @author faber
 */

public class BinarySearch {


    public static void main(String [] args) {
        int[] numbers = {2,4,6,8};
        System.out.println( binary_Search(numbers, 7));
        System.out.println( Arrays.binarySearch(numbers, 7));


    }

    public static int binary_Search(int[] array, int elemento)
    {
        int start = 0, end = array.length - 1, centro = 0;
        while (start <= end)
        {
            centro = (start + end) / 2;
            if (elemento < array[centro])
            {
                end = centro - 1;
            }
            else
            {
                if (elemento > array[centro])
                    start = centro + 1;
                else
                    return centro; // Caso: elemento==array[centro]
            }
        }
        return -1;
    }
}
