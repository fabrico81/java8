package concurrency.interruption;

public class PrimeGenerator extends Thread{

    @Override
    public void run() {
        for (int i = 0; ;i++) {
            System.out.printf("Number %d\n",i);
            if(isPrime(i)){
                if (isInterrupted()){
                    System.out.println("Prime Generator has been is interrupted");
                    return;
                }
            }
        }

    }

    private boolean isPrime(int i) {
        if((i % 2) == 0) {
            System.out.printf("Thread '%s': START\n",
                    Thread.currentThread().getName());
            System.out.printf("Number is prime %d\n", i);
            return true;
        }
        return false;
    }

}
