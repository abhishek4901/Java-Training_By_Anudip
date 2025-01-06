public class vlaueUpdate {
  
        String name;
    
        public static  void fun(vlaueUpdate x){ //fun class for show passing a class (student)
            System.out.println(x.name); //name= abhishek kummar 
            x.name = "Abhishek kumar patel ";
        }
    public static void update(int a){ //caling value of  updated a
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(a ); //
        a=10; //update
        System.out.println(a);//a ki value update
        a=25;//update
        update(a);

        vlaueUpdate s1 = new vlaueUpdate (); //class ka object
        s1.name= "Abhishek"; // this is class ki property
        
        System.out.println(s1.name);
         s1.name = "Abhishek kumar ";
        fun(s1);
        //for print name in update  in function class
        System.out.println(s1.name);
       
     }
}

    
    
    
