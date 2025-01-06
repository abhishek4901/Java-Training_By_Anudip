//private access modifier
// class Student { //default 
//     private String name; //private  variable 
//      int roll_no; //default variable
     
// }

// public class accessmodifier {
//     public static void main(String[] agrs) {

//         Student s1 = new Student(); //class ka object
//         s1.name = "Abhishek"; // can't access  becouse variable is private
//         System.out.println(s1.name);
//        s1.roll_no = 121;
//         System.out.println(s1.roll_no); //it is access because  it is default
       
//     }}

//getter seter method breck the private
class Student { //default 
    private String name; //private  variable 
     int roll_no; //default variablefinal 
 final String collegeName = "Lloyd";
      // Getter for name
    public String getName() {//datatype String variable get name function then return  
        return name;
    }

    // Setter for name
    public void setName(String name) {//void  setName method datatype variable name
        this.name = name; //pahle private vale name me public name gusa(set kr ) dete h
    }

}

public class accessmodifier {
    public static void main(String[] agrs) {

        Student s1 = new Student(); //class ka object

         // Accessing and modifying private variable using setter and getter method
         s1.setName("Abhishek"); //
         System.out.println( s1.getName()); //
        // s1.name = "Abhishek"; // can't access becouse variable is private  you can use set method
        // System.out.println(s1.name);
      
        s1.roll_no = 121;
        System.out.println(s1.roll_no); //it is access because  it is default
    //    s1.collegeName= "liet";//final value can't be changed once declear
   
System.out.println(s1.collegeName);
}

}
