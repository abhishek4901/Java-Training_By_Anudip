
import java.util.Scanner;

class Switch{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number = ");
        int a = sc.nextInt();
        System.out.print("enter second number =  ");
        int b = sc.nextInt();
        System.out.println("enetr 1 for addition \n");
        System.out.println("enter 2 for subtraction \n");
        System.out.println("enter 3 for multiplication \n");
        System.out.println("enter 4 for division \n");
        System.out.println("enter 5 for perform all operation \n");

        int c = sc.nextInt();
        switch (c) {

            case 1:
                System.out.println("addition : " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction : " + (a - b));
                break;
            case 3:
                System.out.println(" Multipkication :" + (a * b));
                break;
            case 4:
                System.out.println("Division :" + (a / b));
                break;
            case 5:
                System.out.println(" Addition :" + a + b);
                System.out.println(" Subtraction :" + (a - b));
                System.out.println(" Multiplication :" + a * b);
                System.out.println("Division : " + a / b);
                break;
            default:
                System.out.println("invalid input");

        }

    }
}
