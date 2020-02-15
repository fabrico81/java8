package java8;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String [] args){

        List<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(1);
        list.add(5);
        list.add(1);

        list.remove(1);

        list.forEach(System.out::println);
    }
}
