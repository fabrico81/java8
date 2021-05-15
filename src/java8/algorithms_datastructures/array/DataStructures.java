package java8.algorithms_datastructures.array;

import java.util.*;

public class DataStructures {

    static int []a = {1,4,3,4,5};

    static Integer [] arrayToConvert = {3,3,6,5,6,7,2,1,7,8};

    public static void main(String[] args) {

        System.out.println("Array size: \n"+ a.length + "\n");
        Arrays.sort(a);
        System.out.println("Array ordered \n");
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]);
        }
        List<Integer> list = Arrays.asList(arrayToConvert);
        Set<Integer> treeSet = new TreeSet(Arrays.asList(arrayToConvert));

        System.out.println("\n TreeSet");
        treeSet.forEach(System.out::println);

        System.out.println(" List: \n");
        list.forEach(System.out::println);
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(arrayToConvert));

        int A[] = {3, 8, 9, 7, 6};
        int B [] = rotateArray(A,3);
        for (int a: B ) {
            System.out.print(a);
        }
        for (int a: A
             ) {
            System.out.print(a);

        }
    }

    static int [] rotateArray(int A[], int k) {

        int size = A.length;
        int i = A.length -1;
        int index = 0;
        int rotateArray [] = new int[size];

        for (int h=1; h<=k; h++) {
            for (int y = 0; y < size-1; y++ ) {
                int temp = A[y];
                //TODO
            }
        }



        while (i >= 0) {
            int temp = A[i];
            rotateArray[index] = temp;
            index++;

            i = i-1;
        }

        return rotateArray;
    }
}
