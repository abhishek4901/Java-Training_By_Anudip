
public class Students {

    private String name;
    private int age;
    private String department;

    public void Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {//datatype String variable get name function then return  
        return name;
    }

    // Setter for name
    public void setName(String name) {//void  setName method datatype variable name
        this.name = name; //pahle private vale name me public name gusa(set kr ) dete h
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;

    }

    public static void main(String[] args) {
        Students s1 = new Students();
        //s1.age = 44;
        System.out.println(s1.age);
        s1.name = "abhishek";
        System.out.println(s1.name);
        s1.department="mca";
        System.out.println(s1.department);
        s1.getName();
       // s1.getAge();
        s1.getDepartment();
       // s1.setAge(23);
        s1.setName("abhi");
        s1.setDepartment("department");
        // Accessing and modifying private variable using setter and getter method
        //      s1.setName("Abhishek"); //
        //      System.out.println( s1.getName());
        // s1.name="abbhi";
        // System.out.println(s1.name);
    }

}
