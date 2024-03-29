package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.print("Print all numbers: ");

        eval(list, n->true);


        System.out.println("Print even numbers:");
        eval(list, n -> n%2 ==0);

        System.out.println("Print majar that 3");

        eval(list, n-> n > 3);

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate){

        for (Integer n : list){
            if(predicate.test(n)){
                System.out.print(n + " ");
            }
        }
    }
}
