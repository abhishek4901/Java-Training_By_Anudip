
import java.util.Scanner;

public class findLargeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the Second number");
        int b = sc.nextInt();

        System.out.println("enter the third number");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("First is greater  number");

            } else {
                System.out.println("Second  is greater  number");

            }
        } else {
            if (b > c) {
                System.out.println("Second  is greater  number");

            } else {
                System.out.println(" Third is greater  number");
                
            }if(a==b||a==c){
                System.out.println(" the numbeer are same number please change the number");

            }

        }

    }
}
