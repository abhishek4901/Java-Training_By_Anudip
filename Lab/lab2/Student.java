// JavaBean Class (Students)
 class Students {
    private String name;
    private int age;
    private String department;

    // Default Constructor
    public Students() {
    }

    // Parameterized Constructor
    public Students(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for department
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

// Main Class for Testing
public class Student {
    public static void main(String[] args) {
        // Using parameterized constructor
        Students s1 = new Students("Abhi", 21, "MCA");
        
        // Accessing properties via getters
        System.out.println("Name - " + s1.getName());
        System.out.println("Age -" + s1.getAge());
        System.out.println("Department - " + s1.getDepartment());

      
    }
}
