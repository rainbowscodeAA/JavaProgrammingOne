package Chapter7;

import java.util.Scanner;

/**
 *Program to determine if 2 lists given by the user are identical or not
 * 
 * @author Anjoulie Alhaj
 */

public class C7_26 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
 public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1: ");

        //input the first value entered as the array length

        int [] list1 = new int [input.nextInt()];

        //enter the rest of the numbers into the array

        for(int i = 0; i < list1.length; ++i) {

            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2: ");

        int [] list2 = new int [input.nextInt()];

        for(int i = 0; i < list2.length; ++i) {

            list2[i] = input.nextInt();
        }

        //run equals method to check if the lists are the same and tell the user
        if(equals(list1, list2) == false)

            System.out.println("Two lists ar not strictly identical");

        else

            System.out.println("Two lists are strictly identical"); 
    }

    
    /**
     * Method to compare the 2 lists 
     * 
     * @param L1 the first array
     * @param L2 the second array
     * @return boolean whether the lists are identical or not 
     */
    //check the values of the list to see if they're the same
    public static boolean equals(int[] L1, int[] L2){

        for(int v = 0; v < L1.length; v++){

            if(L1[v] == L2[v])/*if the values in the list are the same in a spot continue checking*/ 

                continue;

            else

                return false;
        }

        return true;
    }      
}
