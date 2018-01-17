package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse and display a string given by the user
 *
 * @author Anjoulie Alhaj
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String original = input.nextLine();

        //telling the reverse string 
        System.out.println("The reversed string is " + (new StringBuffer(original).reverse().toString()));
    }
}
