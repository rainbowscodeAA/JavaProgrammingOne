package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock paper scissors with the computer until the user wins
 *
 * @author Anjoulie Alhaj
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {

        int compGuess, playerGuess;
        int compWins = 0, playerWins = 0;

        do {
            Scanner input = new Scanner(System.in);
            // 0 - Scissors, 1 - Rock, 2 - Paper
            System.out.println("Enter 0, 1, or 2: ");
            playerGuess = input.nextInt();
            compGuess = (int) (Math.random() * 3);

            switch (playerGuess) {
                case 0:
                    if (compGuess == 0)//tie
                    {
                        if (compGuess == 1)//player loses
                        {
                            compWins++;
                        }
                    }
                    if (compGuess == 2)//player win
                    {
                        playerWins++;
                    }

                case 1:
                    if (compGuess == 0)//player win
                    {
                        playerWins++;
                    }
                    if (compGuess == 1)//tie
                    {
                        if (compGuess == 2)//player loses
                        {
                            compWins++;
                        }
                    }

                case 2:
                    if (compGuess == 0)//player loses
                    {
                        compWins++;
                    }
                    if (compGuess == 1)//player win
                    {
                        playerWins++;
                    }
                    if (compGuess == 2) {//tie
                    }
            }
        } while (compWins <= 2 && playerWins <= 2);
    }
}
