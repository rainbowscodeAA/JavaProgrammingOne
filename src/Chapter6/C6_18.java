package Chapter6;

import java.util.Scanner;

/**
 * Program to check if a password is valid
 *
 * @author Anjoulie Alhaj
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a passoword: ");
        String pendPass /*pending password*/ = input.nextLine();

        if (isValid(pendPass)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    /**
     * Method to check if a password is valid
     *
     * @param pendPass the password the user entered
     * @return true or false is the password valid
     */
    public static boolean isValid(String pendPass) {
        int counter = 0;

        //check is pendPass has at least 8 characters
        if (pendPass.length() < 8) {
            return false;
        }

        //check if pendPass consists of only letters and digits
        for (int n = 0; n < pendPass.length(); n++) {
            if (!Character.isLetterOrDigit(pendPass.charAt(n))) {
                return false;
            }

        }

        //count how many numbers are in pendPass
        for (int n = 0; n < pendPass.length(); n++) {
            if (Character.isDigit(pendPass.charAt(n))) {
                ++counter;
            }
        }

        //check if pendPass has at least 2 numbers
        if (counter < 2) //return Invalid
        {
            return false;
        }

        //return valid
        return true;
    }
}
