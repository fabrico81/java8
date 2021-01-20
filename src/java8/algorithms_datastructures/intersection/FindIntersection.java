package java8.algorithms_datastructures.intersection;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author faber
 *
 * Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
 * the first element will represent a list of comma-separated numbers sorted in ascending order,
 * the second element will represent a second list of comma-separated numbers (also sorted).
 * Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order.
 * If there is no intersection, return the string false.
 *
 * Example
 * Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
 * Output: 1,4,13
 */

public class FindIntersection {

    public static String findIntersection(String [] strArr) {

        TreeSet<Integer> set1 = Arrays.stream(strArr[0].replace(" ", "").split(",")).map(Integer::parseInt).collect(Collectors.toCollection(TreeSet::new));
        TreeSet<Integer> set2 = Arrays.stream(strArr[1].replace(" ", "").split(",")).map(Integer::parseInt).collect(Collectors.toCollection(TreeSet::new));
        set1.retainAll(set2);

        return set1.isEmpty() ? "false" : Arrays.toString(new TreeSet<> (set1).toArray()).replace("]", "").replace("[", "").replace(" ", "");

    }


    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        

    }


}
