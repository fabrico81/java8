package java8.certification.oca.chapter_2;

/**
 * @author faber
 */

public class CompoundOperator {


    public static void main (String... args) {
        byte a = 127;
        byte b = 2;
        byte c = 12 + 2;
        System.out.println(c);
      /*  int a = 8;
        long b = 9;
        b = (a * b);
        a = (int) (a * b);

        System.out.println(b);
        System.out.println(a);
*/

        // int x = 6;
        //boolean y = (x >= 6) || (++x <= 7);
        //     System.out.println(x);
        //    System.out.println(y);
        //  comma();
        // nestedLoop();

        // doWhile();
/*
        int x = 0;
        while(x++ < 10) {}
        String message = x > 10 ? "Greater than" : false;
        System.out.println(message+","+x);
*/
        //    long x = 10;
        //    long y =  2 * x;

  /*      java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for(int x : list) {
            System.out.print(x + ", ");
            break;
        }
*/
/*
        int x = 5;
        System.out.println(x > 6 ? x < 4 ? 10 : 8 : 7);
        */

  /*      boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);
        */

     /*   for( int i=0; i<10 ; ) {
            i = i++;
            System.out.println("Hello World");
            }8*/
/*
        byte a = 40, b = 50;
        byte sum = (byte) (a + b);
        System.out.println(sum);

        int x = 5 * 4 % 3;
        System.out.println(x);

        int x = 0;
        String s = null;
        if(x == s) System.out.println("Success");
        else System.out.println("Failure");

        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if(b = true) System.out.println("Success");
        else System.out.println("Failure");

        int c = 7;
        int result = 4;
        result += ++c;
        System.out.println(result);

        int x = 1, y = 15;
        while (x < 10)
        y––;
        x++;
        System.out.println(x+", "+y);
        do {
            int y = 1;
            System.out.print(y++ + " ");
        } while(y <= 10);*/
/*
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if(i==8) keepGoing = false;
            result -= 2;
        } while(keepGoing);
        System.out.println(result);
*/
/*
        int count = 0;
        ROW_LOOP: for(int row = 1; row <=3; row++)
            for(int col = 1; col <=2 ; col++) {
                if(row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);
*/


/*        int m = 9, n = 1, x = 0;
        while(m > n) {
            m--;
            n += 2;
            x += m + n;
        }

        System.out.println(x);

        final char a = 'A', d = 'D';
        char grade = 'B';

        switch(grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
        }
    }


    /*
    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
            case middleName: // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id=15;
                break;
        }
        return id;
    }*/
/*
    int roomInBelly = 5;
    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }*/
    /*
    public void loop() {
        for (long y = 0, int x = 4; x< 5 && y < 10; x++, y++){ // DOES NOT COMPILE
            System.out.print(x + " ");
        }
    }*/
/*
    public void loopForEach() {
        String[] names = new String[3];
        for(int name : names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }
    }
    */
/*
    public static void comma(){
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for(int i=0; i<names.size(); i++) {
            String name = names.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }
*/
/*
    public static void nestedLoop() {
        int complexArray[][] = {{1,2,3,4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int [] mySimpleArray : complexArray) {
            for (int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray [i] + " /t");
            }
            System.out.println();
        }
    }
*/
/*
    public static void doWhile() {
        int x = 20;
        while(x>0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }
    }

    public static void booleanOper() {
        boolean a = false;
        boolean b = true;

    }

    public void dataType() {
        byte x = 5;
        byte y = 10;
        int z = x + y;
        long l = x + y;
        double d = x + y;
    }
/*
    public static class CompareValues {
        public static void main(String[] args) {
            int x = 0;
            while(x++ < 10) {}
            String message = x > 10 ? "Greater than" : false;
            System.out.println(message+","+x);
        }
    }
    */}
}
