
class Carhuman {

    String companyName;
    String model;
    String fuelType;
    String color;
    static int count;
    int sittingCap;
    int maxSpeed;

    Carhuman(String companyName, String model, String fuelType, String color, int sittingCap, int maxSpeed) {
        this.companyName = companyName;//this use to same variable name use company name variable ke andr company name save kr rhe h  
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.sittingCap = sittingCap;
        this.maxSpeed = maxSpeed;
        count++;
        //Car(String companyName,String model,String fuelType,String color,int sittingCap, int maxSpeed)

    }
    

    public void start() {
        System.out.println("car is started.... ");
    }

    public void drive() {
        System.out.println("car is in Driving mode... ");
    }

    public void breaks() {
        System.out.println("Break applied... ");
    }

    public void stop() {
        System.out.println("car Stopped... ");

    }

    public static void main(String[] args) {
        Carhuman myCar1 = new Carhuman("Tata", "rangerover", "cng", "black", 5, 200);
        System.out.println(myCar1.count + " " + myCar1.companyName);

        Carhuman myCar2 = new Carhuman("mahindra", "bugati", "cng", "brown", 5, 250);
        System.out.println(myCar2.count + " " + myCar1.companyName);

        Carhuman myCar3 = new Carhuman("maruti", "Jaguar", "cng", "gray", 5, 300);
        System.out.println(myCar3.count + " " + myCar1.companyName);

        // myCar1.companyName = "Tata";
        // myCar1.model = "Rangerover";
        // myCar1.fuelType = "CNG";
        // myCar1.color = "Black";
        // myCar1.sittingCap = 5;
        // myCar1.maxSpeed = 200;

        // myCar1.start();
        // myCar1.drive();
        // myCar1.breaks();
        // myCar1.stop();

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
