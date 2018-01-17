package Chapter3;

import java.util.Scanner;

/**
 *Program to guess head or tails
 * 
 * @author Anjoulie Alhaj
 */
public class C3_14 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    
     public static void main(String[] args){
        
        int realF = (int)(Math.random() * 2); 
       
        Scanner input = new Scanner(System.in);
        System.out.println("Guess whether the flip of a coin results in heads(0) or tails(1)?");
        int guessF = input.nextInt();
        
        //tell user if they are right or not
        if(guessF == realF){
            System.out.println("You are correct.");
        }
        else if(!(guessF == realF)){
            System.out.println("You are incorrect.");
        } 
    }   

}
