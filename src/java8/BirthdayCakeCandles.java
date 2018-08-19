package java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class BirthdayCakeCandles {

    public static void main(String [] args){
        int arr [] = {20,4,21,20};
        System.out.println("arr = " + birthdayCakeCaldles(arr));
    }

    private static int birthdayCakeCaldles(int [] arr){

        int max=0, secondMax=0;
        for(int j=0;j<arr.length;j++){
            if(max<arr[j]){
                max=arr[j];
                secondMax=1;
            }else if(arr[j] == max){
                secondMax++;
            }
        } return secondMax;
    }


}
