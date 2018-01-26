package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Program to give the average of a list of numbers provided by the user
 * 
 * @author Anjoulie Alhaj
 */

public class P7 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers will be read: ");
        int [] list = new int [input.nextInt()];
        values(list);
        
        System.out.println("The average is " +mean(list));
        System.out.println("The contents of the list are: "); 
        print(list);
    }
    
    /**
     * Method to input the user's elements into an array
     * 
     * @param amount the array that the elements are put in   
     */
    
    //ask for and enter the numbers for the array
    public static void values(int [] amount){
        Scanner input = new Scanner(System.in);
        System.out.println("Ener " +amount.length+ " elements: ");
        for(int i = 0; i < amount.length; ++i) {
            amount[i] = input.nextInt();
        }
    }
    
    /**
     * Method to find the average of the numbers in the array
     * 
     * @param l the array 
     * @return the average of the array 
     */
    
    //calculate the average of the numbers int the array
    public static double mean(int [] l){
        double sum = 0;
        for(int v = 0; v < l.length; v++){
            sum = sum + l[v]; 
        }
        double average = sum / l.length;
        return average;
    }
    
    /**
     * Method to display the array 
     * 
     * @param L the array  
     */
    
    //print out the array
    public static void print(int [] L){
        System.out.println(Arrays.toString(L));
    } 
}
