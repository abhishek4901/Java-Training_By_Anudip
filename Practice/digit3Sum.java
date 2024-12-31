import java.util.Scanner;

public class digit3Sum {
  public static void main(String[] args) {

    System.out.println ( "Enter the number");
Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rem, sum = 0;
//    123
    // rem  = num % 10;//rem=3
    // sum  = sum + rem;//sum=3 rem =0
    // num  = num / 10; //num=123 after divide num=12
    // rem  = num % 10;//rem=2 
    // sum  = sum + rem;//sum=5,num=12 rem=0
    // num  = num / 10; //num= 1 rem =2
    // sum  = sum + num; //
    //or
    rem = num/100; //rem=1
    System.out.println ("sum = "+ rem);
    sum =num%100; //sum=23
    System.out.println ("sum = "+ sum);
    num =sum/10; //num=2
    System.out.println ("sum = "+ num);
    sum= sum%10;//sum=23 ,after sum=3
    System.out.println ("sum = "+ sum);
    sum = sum+rem+num;

    System.out.println ("sum  of digit = "+ sum);
}
    
}
