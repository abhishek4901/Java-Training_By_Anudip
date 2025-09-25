 

 public class ConstrStudent{ 
    int roll_no; 
    String name;
    double percent;
//constructor bnane liye class name phir class attribute 
    public ConstrStudent ( int roll_no,String name,double percent){
  this.roll_no =roll_no;//this keyword ka use confustion ko dur krne liye krte 
  this.name= name; //this.class attribute and =funnction argument
  this.percent = percent;

    }
    public ConstrStudent(){ //s2 ko print kr rha ye constrcutor bnateh argument ke liye box bnata  ke liye 

    }
public static  void main (String [] agrs){
ConstrStudent s1= new ConstrStudent(121, "Abhishek", 90);
System.out.println(s1.name);
System.out.println(s1.roll_no);
System.out.println(s1.percent);
ConstrStudent s2 = new ConstrStudent();
s2.name ="Abhishek kumar patel" ;
s2.roll_no =122;
s2.percent =99;
System.out.println(s2.name);
System.out.println(s2.roll_no);
System.out.println(s2.percent);
}
 }
 //yadi hm constructor function nhi bnaye to  khud se  hm constructor main ke andr bnake ke dot variable  name me value assign krke sout  kr sskte h 
 //ya to constructor function bnao phir main ke niche phir bnao aur usme agrument do tb dairect sout kr skte h 
