class SumCalculator {
    int sum = 0;
    boolean done = false;

    public synchronized void calculate() {
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        done = true;

        // First notify only one thread
        notify(); // wakes up one waiting thread
        System.out.println("Notified one thread...");

        // Then notify all remaining threads
        notifyAll(); // wakes up all other waiting threads
        System.out.println("Notified all remaining threads...");
    }

    public synchronized void printSum(String name) {
        while (!done) { // Wait until sum is calculated
            try {
                wait(); // releases the lock and waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " - Sum of first 50 natural numbers = " + sum);
    }
}

public class SumWaitNotifyAll {
    public static void main(String[] args) {
        SumCalculator obj = new SumCalculator();

        Thread t1 = new Thread(() -> obj.calculate());
        Thread t2 = new Thread(() -> obj.printSum("Thread 2"));
        Thread t3 = new Thread(() -> obj.printSum("Thread 3"));
        Thread t4 = new Thread(() -> obj.printSum("Thread 4"));

        // Start readers first (they will wait)
        t2.start();
        t3.start();
        t4.start();

        // Start calculator
        t1.start();
    }
}
