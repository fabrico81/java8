package java8.certification.chapter_4;

//import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE

public class BadStaticImports {

    public static void main(String[] args) {
       // Arrays.asList("one"); // DOES NOT COMPILE

        int num = 4;
        newNumber(5);
        System.out.println(num);
    }

    private static void newNumber(int num) {
        num = 8;
    }
}
