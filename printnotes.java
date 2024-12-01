
import java.util.Scanner;

public class printnotes {
    public static void main(String[] args) {
        System.out.println("Enter the nummber");
        Scanner sc = new Scanner(System.in);
        int a = sc .nextInt();
        int  hundred, fifty , ten;

        hundred =a/100;
        a=a%100;
        fifty = a/50;
         a=a%50;
        ten = a/10;
            System.out.println("100 notes " + hundred );
            System.out.println("50 notes " + fifty);
            System.out.println("10 notes " +ten );


        }
        
    }
    

