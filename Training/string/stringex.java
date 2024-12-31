public class stringex {
    public static void main(String[] args) {
        String s1 = new String("hello");// ye heap memory   me store hoga 
        String s4 = new String("hello");// ye heap memory   me store hoga 
         String s2="hello"; //ye stringfool me store hota h 
         String s3="hello"; //ye stringfool me store hota h 
         System.out.println(s2.length());
         System.out.println(s2.substring(1,4));
         System.out.println(s2.substring(1,4));
         System.out.println(s1==s2); //false because store in  different speace
         System.out.println(s3==s2); //true because store in  same speace
         System.out.println(s3  .equals (s2)); //comapre s3 and s3 contrain both contrain same so true
    }
    
}
