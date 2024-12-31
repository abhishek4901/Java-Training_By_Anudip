//decresing product count accourding buy the customer 
import java.util.concurrent.locks.ReentrantLock; 
 class shop implements Runnable { //shop class ka parents class Runnable run method ki implementation
    ReentrantLock lock = new  ReentrantLock();
       public static int productCount = 5; // stock 10 sab  customer ke liye hona chahiye so static
    public synchronized  void checkout (){// se ye syc kr lega ki kitna product  remain h utne hi thread ko enter  krne dega
       lock.lock(); //lock lga rhe to synchronized nhi use krege
       
        try { // ek andr gya aur lock lgaya 
            if (productCount>0){
            Thread.sleep(100); // for payment gatway sleep thread
            System.out.println("checkout Successfully by " + Thread.currentThread().getName());
            productCount--;
            }
            else 
            {
                System.out.println("product is ssout of stock ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        lock.unlock(); // ye unlock krke uper jayega new thread ke liye 

    }

    @Override
    public void run() {
        checkout();
    
    }
}

public class OnlineShoping{ 

    public static void main(String[] args) {
     shop obj = new shop(); //user bnana h 
     Thread [] users =  new Thread[10]; //create new thread 
     for (int i = 0; i < users.length; i++) { 
         users[i] = new Thread(obj); //sab new therad ko particuller index pe store krnah 
         users[i].start();
         
     }
//java compiler  apne man se thread ko pickup kr leta 
//ye output koi sequence nhi hoga jaise jis thread ko cpu milega vaise excecute hoga


    }
}