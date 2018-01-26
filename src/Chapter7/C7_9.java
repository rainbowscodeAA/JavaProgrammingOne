
package Chapter7;

import java.util.Scanner;

/**
 *Program to to determine the minimum number out of 10 numbers provided by the user
 * 
 * @author Anjoulie Alhaj
 */
public class C7_9 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double [] numbers = new double [10];

        System.out.println("Enter ten numbers: ");

        for(int n = 0; n < 10; ++n){

            numbers[n] = input.nextDouble();

        }

        //tell the user what the smallest number in the array is
        System.out.println("The minimum number is: " +min(numbers));  

    }

    
    /**
     * Method to go through all the numbers in the array and determine the minimum 
     * 
     * @param array the 10 numbers entered by the user 
     * @return the minimum value in the array 
     */
    
    // find the smallest value in the array
    public static double min(double[] array){  

        double least = array[0];

        for(int i = 1; i < 10; i++){

            if(array[i] < least)

                least = array[i];

        }

        return least;   

    }
}
