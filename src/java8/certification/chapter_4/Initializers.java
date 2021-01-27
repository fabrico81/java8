package java8.certification.chapter_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author faber
 */

public class Initializers {
    private static final int NUM_BUCKETS = 45;
    private static final ArrayList ARRAY_LIST = new ArrayList();



    public static void main(String[] args) {
   //     NUM_BUCKETS = 5; // DOES NOT COMPILE
        ARRAY_LIST.add(4);
        ARRAY_LIST.set(0,4);
        ArrayList arrayList = new ArrayList();
      //  ARRAY_LIST = arrayList;
        System.out.println(ARRAY_LIST.get(0));


        String string = "";
        String array [] = {"2", "4","5"};
        List<String> list  = Arrays.asList(string, "", "");

        String [] list1 =  list.toArray(array);

    } }
