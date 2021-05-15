package java8.certification.oca.chapter_3;

import java.util.Arrays;

/**
 * @author faber
 */

public class ArrayType {

    public static void main(String args[]) {
        /*
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0 [L indicates an array
*/
        /*
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
    //    againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        objects[0] = new StringBuilder(); // careful!
*/
        /*
        int[] numbers = { 6, 9, 1 };
        DataStructures.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print (numbers[i] + " ");

        System.out.println(" ");
        String[] strings = { "10", "9", "100" };
        DataStructures.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");

*/
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
    }

}
