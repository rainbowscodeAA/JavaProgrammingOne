package Chapter5;

import java.util.Scanner;

/**
 * Program to vote yes or no and once user has quitted shows how many times they
 * said yes or no
 *
 * @author Anjoulie Alhaj
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String args[]) {

        int yVotes = 0, nVotes = 0;
        Scanner input = new Scanner(System.in);
        String pVote;

        do {
            System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            /*the player's vote*/ pVote = input.next().toUpperCase();

            if (pVote.equalsIgnoreCase("y"))/*the player voted yes*/ {
                yVotes++;
            } else if (pVote.equalsIgnoreCase("n"))/*the player voted no*/ {
                nVotes++;
            } else if (pVote.equalsIgnoreCase("q"))/*the player wants to stop voting*/ {
                continue;
            } else /*the player has made an incorrect response*/ {
                System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            }

        } while (!pVote.equalsIgnoreCase("q"));

        System.out.println("Total Yes Votes: " + yVotes);
        System.out.println("Total No Votes: " + nVotes);
    }
}
