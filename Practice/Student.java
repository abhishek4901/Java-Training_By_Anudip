public class Student{
String name;
int roll_no;
double percent;
//print value using function 
public static  void fun(Student x){ //fun class for show passing a class (student)
    System.out.println(x.name); //name= abhishek 
}

public static void main (String [] agrs){

    Student s1 = new Student (); //class ka object
    s1.name= "Abhishek"; // this is class ki property
    s1.roll_no = 121; //dot method use krke variable name me data assign  krte h
    s1.percent =80;
    fun(s1);
    // System.out.println(s1.name);
    // System.out.println(s1.percent);
    // System.out.println(s1.roll_no);
    // System.out.println("this 2nd object");
    // Student s2 = new Student (); //class ka object
    // s2.name= "Abhishek kumar patel "; // this is class ki property
    // s2.roll_no = 121;
    // s2.percent =80;
    // System.out.println(s2.name);
    // System.out.println(s2.roll_no);
    // System.out.println(s2.percent);
 }

    private Student() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
