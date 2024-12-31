import java.util.Random;

class Rectangle {
    // Attributes for length and width
    int length;
    int width;

    // Constructor that accepts length and width as parameters
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return length * width;
    }
}

public class Rectangles {
    public static void main(String[] args) {
        // Instantiate the Random object to generate random values
        Random rand = new Random();

        // Create two Rectangle objects with random values
        int length1 = rand.nextInt(10) + 1; // Random length between 1 and 10
        int width1 = rand.nextInt(10) + 1;  // Random width between 1 and 10
        Rectangle rectangle1 = new Rectangle(length1, width1);

        int length2 = rand.nextInt(10) + 1; // Random length between 1 and 10
        int width2 = rand.nextInt(10) + 1;  // Random width between 1 and 10
        Rectangle rectangle2 = new Rectangle(length2, width2);

        // Calculate the areas of the two rectangles
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Compare the areas using relational operators and print the result
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }

        // Optionally, print the dimensions and areas of both rectangles
        System.out.println("Rectangle1: Length = " + length1 + ", Width = " + width1 + ", Area = " + area1);
        System.out.println("Rectangle2: Length = " + length2 + ", Width = " + width2 + ", Area = " + area2);
    }
}
