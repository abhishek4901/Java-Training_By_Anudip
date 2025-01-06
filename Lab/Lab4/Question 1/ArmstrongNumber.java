import java.util.Scanner;

public class ArmstrongNumber {
    
    // Method to print Armstrong numbers 
    public static void printArmstrongNumber(int start, int end) {
        // Loop  range from start to end
        for (int num = start; num <= end; num++) {
            int originalNumber = num;
            int numDigits = 0;
            int sumOfPowers = 0;
            
            // calculate in digit from 
            while (originalNumber != 0) {
                originalNumber /= 10;
                numDigits++;
            }
            
            originalNumber = num; 
            
            // Sum of the power of each digit
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sumOfPowers += Math.pow(digit, numDigits);
                originalNumber /= 10;
            }
            
            //  condition for checking an Armstrong number
            if (sumOfPowers == num) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        // take input from user
        Scanner sc = new Scanner(System.in);
        
        // Taking input for start and end range
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        
        // Calling the method to print Armstrong numbers in  given range
        System.out.println("Armstrong numbers in the given range:");
        printArmstrongNumber(start, end);
    }
}