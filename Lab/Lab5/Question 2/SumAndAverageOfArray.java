import java.util.Scanner;
public class SumAndAverageOfArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Initialize the array to store the elements
        int[] array = new int[n];
        
        // Initialize the sum to 0
        int sum = 0;
        
        // Loop to take input for each element in the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            // Add the current element to the sum
            sum += array[i];
        }
        
        // Calculate the average
        double average = (double) sum / n;
        
        // Output the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
