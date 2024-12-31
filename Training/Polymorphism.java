//ye complie time  decide aur overloading ho rha h ki okn sa method call krega
public class Polymorphism {
    public  int add(int a,int b) {
        
        return a+b;
    }
    public  float add(float a,float b) {//float
        float x=a+b;
        return a+b;
    }
    public  int add(int a,int b,int c) { //add 3
        
        return a+b+c;
    }
    public  int add(int a,int b,int c,int d) {// add4
        
        return a+b+c+d;
    }


public static void main(String args[]) {
    Polymorphism obj1 = new Polymorphism();
    int sum;
         int sum =obj1 .add(a:2,b:4);
         System.out.println(sum);
        //  float sum =obj1 .add(a:2.3f,b:4.4f); //yha double use krege to f  nih  l ikhna hoga
        //  System.out.println(sum);

    }
}
