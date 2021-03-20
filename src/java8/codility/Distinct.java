package java8.codility;

import java.util.*;

public class Distinct {

    /*
        given an array A consisting of N integers, returns the number of distinct values in array A.
                N is an integer within the range [0..100,000];
                each element of array A is an integer within the range [−1,000,000..1,000,000].

    */


    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1, 3};
        int n = arr.length;
        System.out.printf(String.valueOf(distinct(arr, n)));

    }

    private static int distinct(int arr[], int n) {

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < n; i++)
        {
            // add all the elements to the HashSet
            hs.add(arr[i]);
        }

        // return the size of hashset as
        // it consists of all Unique elements
        return hs.size();
    }
}