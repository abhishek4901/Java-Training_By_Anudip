
import java.util.Scanner;

public class findin2Large {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the Second number");
        int b = sc.nextInt();
        if (a > b) {

            System.out.println("First is greater  number");

        } else {
            System.out.println("Second  is greater  number");

        }
    }
}
