package java8.lambdaexpressions;

import java.util.*;

import static java.util.Collections.shuffle;

public class Java8Tester {



    public static void main(String args[]) {

        List<String> names1 = new ArrayList<>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        Set set = new TreeSet();

        set.add("a");
        set.add("aaa");


        Java8Tester tester = new Java8Tester();

        System.out.printf("Sort and return a list: " + tester.sortAndReturnList(names1).toString());

        System.out.printf("Set" + tester.setWithJava8(set).toString());

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
    /*public static void printPersonsAnonymous(Person roster, new CheckPerson() {
        public boolean test(Person pe) {
            return pe.getGender() == Person.Sex.MALE
                    && pe.getAge() >= 18
                    && pe.getAge() <= 25;
        }
    };*/




      protected Set setWithJava8(Set name) {
          Set set = new HashSet();
          set.add("z");
          set.add("c");
          set.add("aa");
          set.add("ab");
          set.add("aaa");
          set.add("aab");
          set.add("d");
          set.add("b");
          set.addAll(name);

          return set;

      }


      private List<String> sortAndReturnList(List<String> name) {
          Collections.sort(name, (s1, s2 )-> s1.compareTo(s2));
          return name;
      }

}