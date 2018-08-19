package java8;

import java.util.Arrays;

public class PlusMinus {



    static public void main(String [] args){
        int arr[] = {1, -2, -7, 9, 1, -8, -5
        };
        plusMinus(arr);
    }

    static void plusMinus(int []arr){
        int arrSize = arr.length;
        double negative = 0.0;
        double positive = 0;
        double zero = 0.0;

        negative = (int) Arrays.stream(arr).filter(value -> value<0).count();
        positive = (int) Arrays.stream(arr).filter(value -> value>0).count();
        zero = (int) Arrays.stream(arr).filter(value -> value == 0).count();

        if (negative > 0) {
            negative = negative / arrSize;
        }
        if (positive > 0){
            positive = positive / arrSize;
        }
        if(zero>0){
            zero = zero / arrSize;
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
