package Chapter3;

import java.util.Scanner;

/**
 *Program to compare the costs of two products and takes into account quantity 
 * 
 * @author Anjoulie Alhaj
 */
public class C3_33 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    
     public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        //package 1 variables 
        System.out.println("Enter weight and price for package 1: ");
        double oneWeight = input.nextDouble();
        double onePrice = input.nextDouble();
        //package 2 variables
        System.out.println("Enter weitht and price for package 2: ");
        double twoWeight = input.nextDouble();
        double twoPrice = input.nextDouble();
        
        if(oneWeight / onePrice > twoWeight / twoPrice){
            System.out.println("Package 1 has a better price.");
        }
        else if(twoWeight / twoPrice > oneWeight / onePrice){
            System.out.println("Package 2 has a better price.");
        }
        else if(twoWeight / twoPrice == oneWeight / onePrice){
            System.out.println("Two packages have the same price.");
        }          
    }
}
