import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        
        // Declear the matrices row and column size
        int rows = 3;
        int cols = 3;
        
        // Create two 2D arrays (matrices) of Integer objects
        Integer[][] matrix1 = new Integer[rows][cols];
        Integer[][] matrix2 = new Integer[rows][cols];
        Integer[][] resultMatrix = new Integer[rows][cols];
        
        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt(); // Read elements for the first matrix
            }
        }
        
        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt(); // Read elements for the second matrix
            }
        }
        
        //  addition of the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j]; // Add corresponding elements
            }
        }
        
        // Display the resulting matrix
        System.out.println("Resulting Matrix after Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " "); // Print each element of the resulting matrix
            }
            System.out.println(); // New line for each row
        }
        

    }
}
