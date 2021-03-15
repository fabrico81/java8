package java8;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author faber
 */

public class Tree {



    public static TreeMap buildTreeMap() {
        Comparator.reverseOrder();
        TreeMap<String, Integer> treeMap = new TreeMap();
        treeMap.put("g", 1);
        treeMap.put("c", 0);

        return treeMap;

    }

    public static void main(String args[]) {
        TreeMap treeMap = buildTreeMap();

        System.out.println(treeMap.keySet().toString());

    }
}
