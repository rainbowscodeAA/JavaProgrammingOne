package Chapter2;

import java.util.Scanner;

/**
 *Program to calculate how much to tip 
 * 
 * @author Anjoulie Alhaj 
 */
public class C2_5 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        //calculate amount of gratuity
        double gratuityPercent = gratuityRate / 100;
        double gratuity = gratuityPercent * subtotal;
        
        //calculate total
        double total = gratuity + subtotal;
        
        //state gratuity and total
        System.out.print("The gratuity is $" +gratuity+ " and the total is $" +total);
    }

}
