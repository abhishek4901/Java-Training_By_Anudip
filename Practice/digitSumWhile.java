
import java.util.Scanner;

public class digitSumWhile {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // programmer can be do anything
        int rem, sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
            //num =123 after num=12
            //num =12after num=1

        }
        System.out.println("sum of digit" + (sum));

    }
}
