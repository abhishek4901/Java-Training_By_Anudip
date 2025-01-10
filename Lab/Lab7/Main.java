// Define the Vehicle class
class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor for Vehicle class
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method drive to be overridden by subclasses
    public void drive() {
        System.out.println("Vehicle is driving.");
    }
}

// Car subclass extending Vehicle
class Car extends Vehicle {
    // Constructor for Car class
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

//  Bike subclass extending Vehicle
class Bike extends Vehicle {
    // Constructor for Bike class
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override the drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {
        // Instantiate Car and Bike objects
        Car car = new Car("Toyota", "Corolla", 2020, 190);
        Bike bike = new Bike("Yamaha", "YZF-R1", 2022, 290);

        // Print attributes and call drive method
        System.out.println("Car: " + car.make + " " + car.model + ", Year: " + car.year + ", Max Speed: " + car.maximumSpeed);
        car.drive();

        System.out.println("Bike: " + bike.make + " " + bike.model + ", Year: " + bike.year + ", Max Speed: " + bike.maximumSpeed);
        bike.drive();
    }
}
