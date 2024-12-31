
import java.util.Scanner;

public class ArraysEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollno1 = 1001;
        String RollNo1Name = "a";
        double RollNo1markS = 53.5;

        int rollno2 = 1002;
        String RollNo2Name = "ab";
        double RollNo2markS = 51.5;

        int rollno3 = 1003;
        String RollNo3Name = "abc";
        double RollNo3markS = 52.5;

        int rollno[] = {1001, 1002, 1003, 1004, 1005, 1006,};
        String[] Name = new String[5];
        Name[0] = "a";
        Name[1] = "ab";
        Name[2] = "abc";
        double[]  Marks = new double {56.6,32.5,23.4,56.6,43.6};
        int i = sc.nextInt();//nextline =single word
        for (int i = 0; i < 5; i++) {
            rollno[i]=sc.nextInt();
            Marks[i]= sc.nextInt();
            Name[i]=sc .nextLine();
        }
    }

}
