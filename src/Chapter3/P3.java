package Chapter3;

import java.util.Scanner;

/**
 *Program to tell the relationship between the number of coins two people have 
 * 
 * @author Anjoulie Alhaj 
 */
public class P3 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many gold coins does Sam the lepercon have?");
        double vOne = input.nextDouble();
        System.out.println("How many gold coins does Piper the lepercon have?");
        double vTwo = input.nextDouble();
        
        //greater or less
        if(vOne < vTwo){
            System.out.println("The first number is less than the second.");
        }
        
        if(vOne > vTwo){
            System.out.println("The first number is greater than the second.");
        }
        
        //maybe equal to
        if(vOne == vTwo){
            System.out.println("The first number is equal to the second.");
        }
        
        if(vOne <= vTwo){
            System.out.println("The first number is less than or equal to the second.");
        }
        
        if(!(vOne == vTwo)){
            System.out.println("The first number is not equal to the second.");
        }
        
        //possible values
        if(vTwo == 0){
            System.out.println("Cannot divide by zero");
        }
        else if((vOne / vTwo) < 1){
            System.out.println("proper fraction.");
        }
        else{
            System.out.println("improper fraction");
        }
        
        if(vOne >= 90){
            System.out.println("A");
        }
        else if(vOne >= 80){
            System.out.println("B");
        }
        else if(vOne >= 70){
            System.out.println("C");
        }
        else if(vOne >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        
        if(1 <= vTwo && vTwo <= 100){
            System.out.println("In range.");
        }
        else{
            System.out.println("Out of range.");
        }
    }    
}
