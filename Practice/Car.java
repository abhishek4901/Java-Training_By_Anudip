
class Car {

    String model;
    String fuelType;
    String color;
    int sittingCap;
    int maxSpeed;
    String companyName;
    static int count;

    Car(String companyName, String model, String fuelType, String color, int sittingCap, int maxSpeed) {

        this.companyName = companyName;
        model = this.model;
        fuelType = this.fuelType;
        color = this.color;
        sittingCap = this.sittingCap;
        maxSpeed = this.maxSpeed;
        count++;

    }

    public void start() {
        System.out.println("Car Started....");
    }

    public void drive() {
        System.out.println("Car is in Driving mode....");
    }

    public void breaks() {
        System.out.println("Break Applied....");
    }

    public void stop() {
        System.out.println("Car Stoped....");
    }

    // public void count(){
    // count++;
    // }
    public static void main(String[] args) {

        Car myCar1 = new Car("Tata", "nano", "CNG", "Pink", 5, 200);
        System.out.println(count + " " + myCar1.companyName);

        // Car myCar1 = new Car();
        // myCar1.companyName = "Tata";
        // myCar1.model = "nano";
        // myCar1.fuelType = "CNG";
        // myCar1.color = "Pink";
        // myCar1.sittingCap = 5;
        // myCar1.maxSpeed = 200;
        // myCar1.start();
        // myCar1.drive();
        // myCar1.breaks();
        // myCar1.stop();
        Car myCar2 = new Car("Mahendra", "Thar", "Petrol", "Black", 4, 400);
        System.out.println(count + " " + myCar2.companyName);

        Car myCar3 = new Car("Mauriti", "Swift", "Petrol", "Black", 5, 100);

        System.out.println(count + " " + myCar3.companyName);

    }

}
