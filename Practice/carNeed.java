
class carNeed {

    String companyName;
    String modelName;
    String color;
    String fuelType;
    int sittingCap;
    int maxSpeed;

    // carNeed(String comapyName; String modelName; String color; String fuelType; int sittingCap; int maxSpeed,);


}
 
  public void start() {
        System.out.println("car is started");
    }

    public void drive() {
        System.out.println("car is drive mode");
    }

    public void breaks() {
        System.out.println("break applied");
    }

    public void stop() {
        System.out.println("car stopped");
    }

    public static void main(String[] arg) {
        carNeed myCar1 = new.carNeed("Tata", "Rangerover", "CNG", "Balck", "5", 200);
        

            myCar1.companyName = "Jaguar";
            myCar1.modelName = "Rangerover";
            myCar1.color = "black";
            myCar1.fuelType = "CNG";
            myCar1.sittingCap = 5;
            myCar1.maxSpeed = 200;
        

    }
