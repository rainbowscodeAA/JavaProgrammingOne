package Chapter4;

import java.util.Scanner; 

/**
 *Program to check substring 
 * 
 * @author Anjoulie Alhaj
 */
public class C4_22 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();
        
        //check if s2 is a substring of s1
        if(s1.contains(s2)){
        System.out.print(s2 + " is a substring of " + s1);
        }
        else{
        System.out.print(s2 + " is not a substring of " + s1);
        }
    }
}
