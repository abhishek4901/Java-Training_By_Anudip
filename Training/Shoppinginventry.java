
class stock extends Thread {
    static int ProductCount =10; //10 sab  customer ke liye hona chahiye static
        public void run (){
            checkout();
        }
         public static void checkout ( ){
                 try {
                     Thread.sleep(1000);//payment gatway
                     System.out.println("purchase Success Product "+Thread.currentThread().getName());
                     ProductCount--;
                 
             } catch (Exception e) {
                 System.out.println(e);
             }
          }
     }
     

     public class Shoppinginventry {
         public static void main(String[] args) {
    //         Thread t1 = new Thread( ()->stock.checkout()); //run method se functionality assign kr skte h 
    //    t1.start(); //single user liyeh 
       Thread[] users  = new Thread[10];
for (int i = 0; i < users.length; i++) {
     users[i]=new Thread(()->stock.checkout()); //thread create  krne ke liye thread ka constrctor call krna hi hoga
       users [i].start(); //har array ke user ke liye use new thread create kiya gya uskel iye  aur phirf user ke thread start kiya gya
    //    stock.checkout()
    
}


    }
}
