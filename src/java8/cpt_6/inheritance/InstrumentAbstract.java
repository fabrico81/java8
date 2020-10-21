package java8.cpt_6.inheritance;

public abstract class InstrumentAbstract {

    private static int a = 0;
    private int b = 0;

    public String name;


    public static void sing(){
        System.out.println("a = " + getA());

    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        InstrumentAbstract.a = a;
    }

    public abstract void song();

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
