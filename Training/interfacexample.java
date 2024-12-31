package interfacexample;
interface  A {
    void display ();
}
interface  B {
    void display ();
}
public class interfacexample implements A,B {
    
    public void display(){
        System.out.println( "display");
    }
    
    public static void main (String [] args ){
        interfacexample obj = new interfacexample();
        
    }
}