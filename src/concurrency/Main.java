package concurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Minimum Priority: %s\n",
                Thread.MIN_PRIORITY);
        System.out.printf("Normal Priority: %s\n",
                Thread.NORM_PRIORITY);
        System.out.printf("Maximum Priority: %s\n",
                Thread.MAX_PRIORITY);

        Thread threads [];
        Thread.State status[];
        threads = new Thread[10];
        status = new Thread.State[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Calculator());
            if ((i % 2) == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("My Thread " + i);
        }
        try (FileWriter file = new FileWriter("C:\\Users\\Faber\\data\\log.txt");
             PrintWriter pw = new PrintWriter(file);) {

            for ( int i = 0; i < 10; i++) {
                pw.println("Main : Status of Thread " + i + " : " + threads[i].getState());
                status[i] = threads[i].getState();
            }
            for ( int i = 0; i < 10; i++) {
                threads[i].start();
            }

            boolean finish = false;
            while (!finish) {
                for (int i = 0; i < 10; i++) {
                    if (threads[i].getState() != status[i] ) {
                        writeThreadInfo(pw, threads[i], status[i]);
                    }
                }
                finish = true;
                for (int i =0; i < 10; i++) {
                    finish = finish && (threads[i].getState() ==
                            Thread.State.TERMINATED);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } ;

    }

    private static void writeThreadInfo(PrintWriter pw, Thread thread, Thread.State status) {

        pw.printf("Main : id %d - %s\n", thread.getId(), thread.getName());
        pw.printf("Main : Priority: %d\n", thread.getPriority());
        pw.printf("Main : Old state %s\n", status );
        pw.printf("Main : New state %s \n", thread.getState());
        pw.printf(" Main : ********************\n");
    }
}
