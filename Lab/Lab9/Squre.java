public class Squre {
    public static void main(String[] args) {
        // Array of numbers
        int[] arr = {1, 20, 50, 15, 30};

        // Create first thread for calculating average
        Thread avgThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                double average = sum / 10.0;
                System.out.println("Average of first 10 numbers: " + average);
            }
        });

        // Create second thread for printing squares
        Thread squareThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int num : arr) {
                    System.out.println("Square of " + num + ": " + (num * num));
                }
            }
        });

        // Start the threads 
        try {
            avgThread.start();
            avgThread.join();  
            squareThread.start();
            squareThread.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
