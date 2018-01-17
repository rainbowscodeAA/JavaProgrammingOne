package Chapter2;

import java.util.Scanner;

/**
 *Program to calculate your bill when eating out 
 * 
 * @author Anjoulie Alhaj 
 */
public class P2 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt 
     */
    public static void main(String[] args){
        
        final double SALES_TAX_PERCENT = 0.1;
        final double TIP_PERCENT = 0.15;
                
        // establish what the user ordered
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the meal, drink, and dessert: ");
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();
        
        //calculate price of food
        double food = meal + drink + dessert;
        
        // calculate sales tax
        double salesTax = food * SALES_TAX_PERCENT;
        
        // calculate tip
        double tip = (salesTax + food) * TIP_PERCENT;
        
        // calculate total cost
        double total = food + salesTax + tip;
        
        // display food price, sales tax, tip, and total
        System.out.print("The price of food is $" +food+ ", the sales tax is $" +salesTax+ ", the tip is $" +tip+ ", and the total cost is $" +total);
        
    }
}
