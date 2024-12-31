class Abc1 implements Runnable{

    static Abc1 obj1;
    public void run (){
        for (int i = 0; i < 10; i++) { 
            System.out.println("therad of ABC 1");
            
        }
    }

}
class Abc2 implements Runnable{

    static Abc1 obj2;
    public void run (){
        for (int i = 0; i < 10; i++) { 
            System.out.println("therad of ABC 2");
            
        }
    }

}


public   class  RunnerableEnterface {
    public static void main(String[] args) throws InterruptedException {
        Abc1 obj1= new Abc1();
        Abc2 obj2= new Abc2();
        Thread t1 = new  Thread (obj1);
        t1.start();
        Thread.sleep(100);
        Thread t2 = new  Thread (obj2);
        t2.start();
        // obj1.start();
        
    }
}