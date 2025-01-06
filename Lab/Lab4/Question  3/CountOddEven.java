import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        // input from the user
        Scanner sc = new Scanner(System.in);
        // Initialize counters 
        int countOdd = 0;
        int countEven = 0;
        
        // Start loop
        while (true) {
            System.out.print("Enter a number (or -1 to exit): ");
            int number = sc.nextInt();
            
            // Check if the entered number is -1 to break the loop
            if (number == -1) {
                break;
            }
            
            // Check if the number is even
            if (number % 2 == 0) {
                // Increment 
                countEven++;
            } else {
                // Increment 
                countOdd++;
            }
        }
        
        // Print the total count of odd and even numbers
        System.out.println("Total odd numbers: " + countOdd);
        System.out.println("Total even numbers: " + countEven);
    }
}
