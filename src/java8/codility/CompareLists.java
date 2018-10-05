package java8.codility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompareLists {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> resultArray = new ArrayList<Integer>();
        Integer aP = 0;
        Integer bP = 0;

        if (a.size() == (b.size())) {
            for (int i = 0; i <= a.size() - 1; i++) {
                aP += (a.get(i) > b.get(i) ? 1 : 0);
                bP += (a.get(i) < b.get(i) ? 1 : 0);
            }
            resultArray.add(aP);
            resultArray.add(bP);
        }
        return resultArray;
    }

    public static void main(String[] args) throws IOException {


        List<Integer> aP = new ArrayList<>();
        aP.add(12);
        aP.add(30);
        aP.add(30);
        List<Integer> bP = new ArrayList<>();
        bP.add(12);
        bP.add(32);
        bP.add(32);

        List<Integer> result = compareTriplets(aP, bP);
        result.forEach(integer ->
                System.out.println(integer.intValue() + " "));
    }
}

