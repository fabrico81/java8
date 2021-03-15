package java8.certification.oca.chapter_3;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

/**
 * @author faber
 */

public class CoreJavaApi {

    public static void main(String []args) {

// immutability
//        String s1 = "1";
//        String s2 = s1.concat("2");
//        s2.concat("3");
//        System.out.println(s2);

//        String string = "animals";
//        System.out.println(string.substring(3)); // mals
//        System.out.println(string.substring(string.indexOf('m'))); // mals
//        System.out.println(string.substring(3, 4)); // m
//        System.out.println(string.substring(3, 7)); // mals
//        System.out.println(string.indexOf(0));
//        System.out.println(string.substring(0, 2));
//        System.out.println(string.substring(0, 7));
/*
        String fish = "tuna";
        int a = 4;
        String anotherFish = fish + 1;
        System.out.println(anotherFish);
*/
/*
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
*/
//        String letters = "abcdef";
//        System.out.println(letters.length());
//        System.out.println(letters.charAt(3));
        //  System.out.println(letters.charAt(6));

/*        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7) + "@");
        System.out.println(numbers.substring(7) + "@");
*/
/*
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");
*/

/*
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length();
        System.out.println(total);
*/
/*
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);
*/
/*
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.reverse();
        System.out.println(puzzle);
*/
/*
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        String beans[] = new beans[6];
        java.util.Date[] dates[] = new java.util.Date[2][];
   //     int[][] types = new int[][];
     //   int[][] java = new int[][];
*/
        char[]c = new char[2];
/*
        int length = c.capacity;
        int length1 = c.capacity();
        int length2 = c.length;
        int length3 = c.length();
        int length4 = c.size;
        int length5 = c.size();
*/

        ArrayList l = new ArrayList();
/* INSERT CODE HERE
        int length = l.capacity;
        int length1 = l.capacity();
        int length2 = l.length;
        int length3 = l.length();
        int length4 = l.size;
        int length5 = l.size();
*/
/*
    String [] str1 = {"a", "b", "c"};
    String [] srt2 = {"a", "b", "c"};
        if (str1.equals(srt2)) {
            System.out.println("equal");
        } else {
            System.out.println("not");
        }

        ArrayList arrayList = new ArrayList();
        arrayList.remove(0);

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (Integer v : values) System.out.print(v);

        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array.length);
        System.out.println(array[0]);

        String [] names = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(names[0]);


        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);


        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) System.out.print(age);
*/

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
/*
        List<String> one = new ArrayList<>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
            System.out.println("A");
        else if (one.equals(two))
            System.out.println("B");
        else
            System.out.println("C");


        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        date.plusHours(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());


        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());


        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());


        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
                .SHORT);
        System.out.println(f.format(d));
*/

/*

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("1");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("2");
        System.out.println(a1.equals(a2));
*/



/*
        String a = "abc";
        String b = a.toUpperCase();
        b.replace("B", "2").replace('C', '3');
        System.out.println("b=" + b);
        b = b.replace("B", "2").replace('C', '3');

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        StringBuilder omega = new StringBuilder("abc");
        StringBuilder delta = omega.append("de");

        delta = delta.append("f").append("g");
        System.out.println("omega=" + omega);
        System.out.println("delta=" + delta);
*/
/*
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        int end = sb.indexOf("s");
        System.out.println(sub + " " + len + " " + ch +  " " + end);
*/
/*
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        sb.deleteCharAt(5); // throws an exception

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z); // false

        String i = "Hello World";
        String y ="Hello World";
        System.out.println(i == y); // true

        String o = "Hello World";
        String p = " Hello World".trim();
        System.out.println(x.equals(z)); // true

/*
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);

        StringBuilder beta = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            beta.append(current);
        System.out.println(alpha);
*/
    }
}
