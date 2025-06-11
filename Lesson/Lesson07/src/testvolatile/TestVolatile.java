package testvolatile;

public class TestVolatile  extends Thread {
    volatile  boolean keepRunning = true;
    public void run() {
        long count = 0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated. " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile test = new TestVolatile();
        test.start();
        Thread.sleep(1000);
        test.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}
