package Chapter6;

import java.util.Scanner;

/**
 * Program to convert dollars to another currency
 *
 * @author Anjoulie Alhaj
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //ask how many euros = $1
        System.out.println("How many Euros will a dollar buy?");
        double euro = input.nextDouble();
        //ask how many pounds = $1
        System.out.println("How many Pound Sterling will a dollar buy?");
        double poundS = input.nextDouble();
        //ask how many yen = $1
        System.out.println("How many Yen will a dollar buy?");
        double yen = input.nextDouble();

        String again = "";
        do {
            //how many dollars users wants to convert 
            System.out.println("Enter the number of dollars: ");
            double dollars/* orignal amount of dollars*/ = input.nextDouble();

            //what currency the user wants their $s in
            System.out.println("Enter 'E' to buy Euros, 'P' to buy Pounds, or 'Y' to buy Yen: ");
            String currency = input.next().toUpperCase();
            char c = currency.charAt(0);

            double finalAmount;
            //go to method for coversion 
            switch (c) {
                case 'E':
                    finalAmount = convert(euro, dollars);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.%n", dollars, finalAmount);
                    break;

                case 'P':
                    finalAmount = convert(poundS, dollars);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings.%n", dollars, finalAmount);
                    break;

                case 'Y':
                    finalAmount = convert(yen, dollars);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.%n", dollars, finalAmount);
                    break;
            }

            //ask if user would like to have another conversion 
            do {
                System.out.println("Are there more conversions to perform?");
                again = input.next();
            } while (!again.equalsIgnoreCase("No") && !again.equalsIgnoreCase("Yes"));

        } while (again.equalsIgnoreCase("Yes"));

    }

    /**
     * Method to convert currencies and calculate the tax deduction
     *
     * @param a the amount of other currency a dollar can buy
     * @param b the amount of dollars we are converting
     * @return the amount of currency that can be gotten with the dollars
     */
    public static double convert(double a, double b) {
        double deducted = 0.0;
        //tax deduction 
        if (b <= 100) {
            deducted = b * 0.9;
        } else {
            deducted = b * 0.95;
        }
        return (a * deducted);
    }
}
