package concurrency.controllinginterruption;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        FileSearch search = new FileSearch("C:\\Windows", "explorer.exe");

        Thread thread = new Thread(search);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
