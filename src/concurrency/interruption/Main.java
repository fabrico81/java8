package concurrency.interruption;

public class Main {

    public static void main(String[] args) {
        Thread task = new PrimeGenerator();
        task.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.interrupt();
        System.out.printf("Thread status %s\n",
                task.getState());
        System.out.printf("Thread interrupted %s\n",
                task.isInterrupted());
        System.out.printf("Thread is Alive %s\n",
                task.isAlive());
    }
}
