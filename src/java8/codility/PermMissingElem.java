package java8.codility;

import java.util.*;

/**
 * Find the missing element in a given permutation.
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
 * which means that exactly one element is missing.
 * Your goal is to find that missing element.
 *
 *
 * @author faber
 *
 */

public class PermMissingElem {

    public static void main(String[] args){
        int a [] = {1,3,4,2,5,7,8};
        System.out.println("permMissingEleme() = " + permMissingEleme(a));

    }

    private static int permMissingEleme(int A[]){

//        int n = A.length + 1;
//        int sumOfAllElements = (n * (1 + n)) / 2;
//        int missingElement = sumOfAllElements - A.sum();
//        return missingElement;


//        List<Integer> orderList = DataStructures.asList(A);
//        Collections.sort(orderList);
//
//        for (int i = 0; i < orderList.size(); i++){
//            if(orderList.get(i) == count){
//                count++;
//            }
//            else{
//                return  count;
//            }
//        }
        return 0;
    }


    private static int compare(int o1, int o2){
        if(o1 != o2) {
            return o1;
        }else{
            o2++;
        }
        return o1;
    }
}
