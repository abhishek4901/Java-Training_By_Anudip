
import java.util.Scanner;

class nestedIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
       
        if (age < 18) {

            System.out.print("Age is less than 18");
        }

        if (age == 18) {
            System.out.print("Age is equal to 18");
        }
        if (age > 18) {
            System.out.print("Age is greater than 18");
        }
    }

}
