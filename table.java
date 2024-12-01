
import java.util.Scanner;



public class table {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int i = 1,sum;
        while (i <= 10) {
            sum =n*i;
            System.out.println( n+ "*"+i+"=" +sum);
            i++;
        }
    }
}
