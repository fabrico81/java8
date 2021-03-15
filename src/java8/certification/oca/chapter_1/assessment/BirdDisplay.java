package java8.certification.oca.chapter_1.assessment;


public class BirdDisplay {

    int i;
    double d;
    boolean b;

    public static void main(String[] name) {
        method_a();
        method_b();
        method_d();
    }

    private static void method_b() {
        System.out.println(new BirdDisplay().b);
    }

    public static void method_d() {
        System.out.println(new BirdDisplay().d);
    }

    public static void method_a() {
        int a = 1;
        System.out.println(a);
    }

    public static void method_i() {
        System.out.println(new BirdDisplay().i);
    }
}
