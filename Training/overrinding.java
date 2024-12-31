public class overrinding { // parent class
    String color;
    public void sound (){
        System.out.println("Animal sound");
    }
    
}
class Dog extends  Animal{ //child class
    @Override 
 public void sound(){
    super.sound();
    System.out.println("Dog Sound");
 }

}
 public static void main(String [] args){
    Dpg dog1 = new Dog();
    dog1 = 
 }