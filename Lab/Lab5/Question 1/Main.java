// Base class 
class Vehicle {
    // Method to start the vehicle
    void start() {
        System.out.println("Vehicle started.");
    }
}

// childclass Car extending Vehicle
class Car extends Vehicle {
    @Override
    // start method to print "Car started."
    void start() {
        System.out.println("Car started.");
    }
}

// childclass Motorcycle extending Vehicle
class Motorcycle extends Vehicle {
    @Override
    //  start method to print "Motorcycle started."
    void start() {
        System.out.println("Motorcycle started.");
    }
}

class Garage {
    void serviceVehicle(Vehicle vehicle) {
    // calling its start method
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        
        // Create an instance of the Garage class
        Garage garage = new Garage();
        
        // Call the serviceVehicle method 
        garage.serviceVehicle(car);
        garage.serviceVehicle(motorcycle);
    }
}
