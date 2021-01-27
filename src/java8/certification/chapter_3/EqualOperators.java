package java8.certification.chapter_3;

/**
 * @author faber
 */

public class EqualOperators {
    String name;
    public static void main(String[] args) {
        EqualOperators t1 = new EqualOperators();
        EqualOperators t2 = new EqualOperators();
        EqualOperators t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false
        System.out.println(t1 == t3); // true
        System.out.println(t1.equals(t3)); // true
    }
}
