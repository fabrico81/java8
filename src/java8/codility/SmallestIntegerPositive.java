package java8.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SmallestIntegerPositive {

    public static void main(String[] args) {
        int [] a = {1,2,3,6};
        System.out.println(smallest(a));

    }

    static int smallest(int a[]){
        Set<Integer> set = new TreeSet<>();
        for (int e : a) {
            if (e > 0) {
                set.add(e);
            }
        }

        for (int i = 1; i <= a.length+1; i++) {
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
