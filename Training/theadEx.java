
class Abc1 extends Thread {

    @Override
    public void run() {
//    cpu priority kehisab se output dega    
        for (int i = 0; i < 10; i++) {
            System.out.println("thread of abc -1");
        }
    }
}

class Abc2 extends Thread {

    @Override //run method ko overside kr rhe h 
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("thread of abc -2");
        }
    }
}
public interface theadEx {
    public static void main(String[] args) {
        Abc1 obj1 = new Abc1(); //abc1 class ka 1st obj object 2nd abc constructor abd first abc class ka name  h 
        Abc2 obj2 = new Abc2();//abc1 class ka 2nd obj object 2nd abc constructor h 
// Abc2 obj3 = new Abc2(); //abc2 class ka 1 obj object 2nd abc constructor h 
        obj1.start(); // thread ko chlane  liye start method se call krna hota h 
        obj2.start(); // thread ko chlane  liye start method se call krna hota h 
    }
}
