public class passingint_String_class {
    String name;
int roll_no;
double percent;

public static void integ(int a){ //integ class for show int data type passing 
    System.out.println(a); //a=15 
}
public static void string(String  a){ //string class for show String data type passing , string data type class me kya h name to name print hoga 
    System.out.println(a); //a= abhishek class
}
public static  void fun(passingint_String_class s1){ //fun class for show passing a class (passingint_string_class)
    System.out.println(s1.name); //name= abhishek 
    System.out.println(s1.percent); //percent = 80%
    System.out.println(s1.roll_no); //roll no =121 
}

public static void main (String [] agrs){
int a=10;
integ(a+5); //integ function calling 
String  name ="abhishek class";
string (name);//string function calling


    passingint_String_class s1 = new passingint_String_class (); //class ka object
    s1.name= "Abhishek"; // this is class ki property
    s1.roll_no = 121; //dot method use krke variable name me data assign  krte h
    s1.percent =80;
    fun(s1); //function calling class object s1
}}
