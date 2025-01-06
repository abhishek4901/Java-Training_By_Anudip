import java.util.Scanner;
 public class Car {
    // Attributes (model, year, and price)
    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) { // Constructor 
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for Car 1
        System.out.println("Enter details for Car 1:");
        System.out.print("Make: ");
        String make1 = sc.nextLine();
        System.out.print("Model: ");
        String model1 = sc.nextLine();
        System.out.print("Year: ");
        short year1 = sc.nextShort();
        System.out.print("Price: ");
        int price1 = sc.nextInt();
        sc.nextLine();
        Car car1 = new Car(make1, model1, year1, price1);// Creating object Car 1
        
        // Take input for Car 2
        System.out.println("\nEnter details for Car 2:");
        System.out.print("Make: ");
        String make2 = sc.nextLine();
        System.out.print("Model: ");
        String model2 = sc.nextLine();
        System.out.print("Year: ");
        short year2 = sc.nextShort();
        System.out.print("Price: ");
        int price2 = sc.nextInt();
        sc.nextLine(); 
        
        Car car2 = new Car(make2, model2, year2, price2); // Creating Car object for Car 2
    }
}
