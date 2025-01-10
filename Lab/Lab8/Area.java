// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate the area
    abstract double calculateArea();
}

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class to test the Shape subclasses
public class Area {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle(5);
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculate and print the areas
        System.out.println(" area of the circle is: " + circle.calculateArea());
        System.out.println("area of the rectangle is: " + rectangle.calculateArea());
    }
}
