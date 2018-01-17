package Chapter4;

import java.util.Scanner; 

/**
 *Program to show student major and status 
 * 
 * @author Anjoulie Alhaj 
 */
public class C4_18 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    
     public static void main(String[] args){
        
       
         Scanner input = new Scanner(System.in);
         System.out.println("Enter two characters: ");
         String status = input.nextLine().toUpperCase();
         
         char b = status.charAt(0);
         char c = status.charAt(1);
         
         //determine major
         if(c == '1' ^ c == '2' ^ c == '3' ^ c == '4'){
            switch(b){
                 case 'M': System.out.print("Mathematics");
                    break; 
                 case 'C': System.out.print("Computer Science");
                    break;
                 case 'I': System.out.print(" Information Technology");
                    break;
                 default:  System.out.print(" Invalid input");
                 
            }
            //determine grade
            if(b == 'M' ^ b == 'C' ^ b == 'I'){
                switch(c){
                     case '1': System.out.print(" Freshman");
                         break;
                     case '2': System.out.print(" Sophomore");
                         break;
                     case '3': System.out.print(" Junior");
                         break;
                     case '4': System.out.print(" Senior");
                         break;
                }
            }
         }
         else{
             System.out.print(" Invalid input");
         }
    }
}
