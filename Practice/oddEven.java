import java.util.Scanner;
 class oddEven {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(" Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }
    

    }
    
}
