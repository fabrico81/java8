package java8.certification;

import java.util.HashSet;
import java.util.Set;

/**
 * @author faber
 */

public class Main{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5);  // A
        System.out.println(","+rectangle.hasEdges()); // B


    }
}

class Shape {
    public Shape() {
        System.out.print("Shape");
    }
    public Shape(int edge) {
        System.out.print("ShapeEdge");
    }
    boolean hasEdges() {
        return false;
    }
}
class Rectangle extends Shape {
    public Rectangle(int age) {
        System.out.print("Rectangle");
    }
    public boolean hasEdges() { // C
        return true;
    }

    public int solution(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}