package java8.codility;

import java.util.stream.LongStream;


public class SumArrayElement {


    static public void main(String []args){

        long t[] = {20000,-2, 2400000,200000, 2000,-2};
        long sum = aVeryBigSum(t);
        System.out.println("SUM :" + sum);
    }

    static Long aVeryBigSum(long arr[]){
        Long sum = LongStream.of(arr).sum();
        return sum;
    }
}
