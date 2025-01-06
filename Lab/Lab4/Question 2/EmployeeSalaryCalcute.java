import java.util.Scanner;

public class EmployeeSalaryCalcute {
    public static void main(String[] args) {
        // taking user input
        Scanner sc = new Scanner(System.in);
        
        // Initialize  variable 
        int choice = -1;
        while (choice == -1) {
            
            System.out.print("Enter the basic salary of the employee: ");
            double basicSalary = sc.nextDouble();  
            // Declare variables 
            double hra, da, grossSalary;
            
            // Calculate  basic salary
            if (basicSalary > 15000) {
                // HRA is 20% and DA is 60%
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                //  fixed HRA of 3000 and DA is 70% of basic salary
                hra = 3000;
                da = 0.70 * basicSalary;
            }
            

            grossSalary = basicSalary + hra + da;
            
            // Print  gross salary
            System.out.println("Gross Salary: " + grossSalary);
            
            //  continue or exit the loop
            System.out.print("Enter -1 to continue or any other number to exit: ");
            choice = sc.nextInt();  // for choice  continue or exit
        }
        
    }
}
