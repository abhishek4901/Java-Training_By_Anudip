public class RacingSimulation {
    public static void main(String[] args) {
        // Create three threads with different names and priorities
        Thread racer1 = new Thread(new Racer(), "Racer 1");
        Thread racer2 = new Thread(new Racer(), "Racer 2");
        Thread racer3 = new Thread(new Racer(), "Racer 3");

        // Set different priorities
        racer1.setPriority(Thread.MAX_PRIORITY); // Highest priority
        racer2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        racer3.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        // Start the threads
        racer1.start();
        racer2.start();
        racer3.start();
    }
}

class Racer implements Runnable {
    @Override
    public void run() {
        //  race by iterating 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Iteration: " + i);
            try {
                
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
