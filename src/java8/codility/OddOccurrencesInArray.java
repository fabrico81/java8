package java8.codility;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
//        int a[] = {9, 3, 9, 3, 9, 7, 9};
        int a [] = {1,3,3,5,5};
        System.out.println("oddOccurrencesInArray = " + oddOccurrencesInArray(a));

    }

    private static int oddOccurrencesInArray(int a[]) {
        int i;
        int res = 0;
        for (i = 0; i < a.length; i++) {
            res = res ^ a[i];
        }
        return res;
    }
}