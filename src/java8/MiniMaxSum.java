package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MiniMaxSum {

    static public void main(String []args){
        int []arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);

    }
    static private void miniMaxSum(int []arr) {

        Long maxSum = Long.valueOf(0);
        Long minSum = Long.valueOf(0);

        Arrays.sort(arr);

        for(int i = 0, j = arr.length-1; i < arr.length-1 && j > 0; i++, j--){
//            System.out.println("arr[i] = " + arr[i]);
            System.out.println("arr[j] = " + arr[j]);
            maxSum += arr[j];
            minSum +=arr[i];
        }
        System.out.println( minSum+ " "+ maxSum);
    }

}
