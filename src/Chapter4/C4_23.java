package Chapter4;

import java.util.Scanner; 

/**
 *Program to calculate payroll
 * 
 * @author Anjoulie Alhaj 
 */
public class C4_23 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double fTax = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double sTax = input.nextDouble();
        
        //Tell information
            System.out.printf("\nEmployee Name: %s" ,name);
            System.out.printf("\nHours Worked: %.2f" ,hours);
            System.out.printf("\nPay Rate: $%.2f" ,payRate);
            //calculate overall pay
            double grossPay = hours * payRate;
            System.out.printf("\nGross Pay: $%.2f" ,grossPay);
            
            double fTotal = grossPay * fTax;
            double sTotal = grossPay * sTax; 
            //Tell Taxes
            System.out.printf("\nDeductions:\n   Federal Witholding (%.2f%%): $%.2f\n   State Witholding (%.2f%%): $%.2f\n   Total Deduction: $%.2f", (fTax * 100), fTotal, (sTax * 100), sTotal, (sTotal + fTotal)); 
            
            System.out.printf("\nNet Pay: $%.2f", (grossPay -(sTotal + fTotal)));
    }    
}
