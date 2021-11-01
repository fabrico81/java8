package java8.certification;

public class MyStuff {
    String name;

    MyStuff(String n) {
        name = n;
    }

    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("guitar");
        MyStuff m2 = new MyStuff("tv");
        System.out.println(m2.equals(m1));
    }

    public boolean equals(Object o) {
        String newLine = System.lineSeparator();
        MyStuff m = (MyStuff) o;
        String m2 = "Piano";
        String m1 = "Radio";
        Object o2 = (String) m2;
        Object o1 = (String) m1;
        if (o2.equals(o1)) {
            System.out.println("TRUE" + System.lineSeparator());
        } else {
            System.out.print("FALSE" + System.lineSeparator());
        }

        if (m != null) {
            return true;
        }
        return false;

    }
}
