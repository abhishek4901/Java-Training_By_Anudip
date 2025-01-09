import java.util.Random;

public class ThreeDArray {
    public static void main(String[] args) {
        int x = 3, y = 3, z = 3; // dimensions of the 3D array
        int[][][] array = new int[x][y][z]; // declaration of the 3D array

        // Initialize the 3D array with random values
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = random.nextInt(80); //  take random values between 0 and 80
                }
            }
        }

        // Find the maximum value in the array
        int max = array[0][0][0]; // assume the first element is the maximum initially
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    if (array[i][j][k] > max) { // update max if a larger value is found
                        max = array[i][j][k];
                    }
                }
            }
        }

        //  average of all elements
        int sum = 0;
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    sum += array[i][j][k]; //  sum of all elements
                    count++; // count  number of elements
                }
            }
        }
        double average = sum / (double) count; // calculate the average

        // Display the array
        System.out.println("3D Array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " "); // print each element
                }
                System.out.println(); // new line for each 2D layer
            }
            System.out.println(); // additional new line for  between layers
        }

        // Display the results
        System.out.println("Maximum value: " + max); // print the maximum value
        System.out.println("Average value: " + average); // print the average value
    }
}
