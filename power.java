
import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        System.out.println("enter the exponent number");
        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {

            r = r * n;

        }
        System.out.println("power the number " + r);
    }

}
