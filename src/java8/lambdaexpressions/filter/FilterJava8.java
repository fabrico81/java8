package java8.lambdaexpressions.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "faber");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"faber".equals(line))     // we dont like faber
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

        filter();

    }

    private static void filter() {
        List<String> list =  Arrays.asList("Winter", "Spring", "Fall");
        List<String> result = list.stream()
                .filter(it -> !"Winter".equals(it))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
