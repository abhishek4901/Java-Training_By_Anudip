
import java.util.Scanner;

public class ForwBackw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        boolean isPalindrome = true;
        for (int i = 0; i < size / 2; i++) {
            if (array[i] != array[size - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "The array is a palindrome." : "The array is not a palindrome.");
    }

}