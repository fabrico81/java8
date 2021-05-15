package java8.certification.oca.chapter_4;

//import static java.util.DataStructures; // DOES NOT COMPILE
//static import java.util.DataStructures.*; // DOES NOT COMPILE

public class BadStaticImports {

    public static void main(String[] args) {
       // DataStructures.asList("one"); // DOES NOT COMPILE

        int num = 4;
        newNumber(5);
        System.out.println(num);
    }

    private static void newNumber(int num) {
        num = 8;
    }
}
