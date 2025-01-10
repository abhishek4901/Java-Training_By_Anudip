// Base class
class Shape {
    // Method to b overridden
    public double getArea() {
        return 0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private int radius;

    // Constructor for Circle
    public Circle(int radius) {
        this.radius = radius;
    }

    // Overriding getArea() method for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square
class Square extends Shape {
    private int length;

    // Constructor for Square
    public Square(int length) {
        this.length = length;
    }

    // Overriding 
    @Override
    public double getArea() {
        return length * length;
    }
}

// Main class 
public class Area {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Radius of 5
        Shape square = new Square(4); // Length of 4

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
    }
}
