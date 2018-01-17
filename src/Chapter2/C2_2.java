package Chapter2;

import java.util.Scanner;

/**
 *Program to compute the area and volume of a cylinder  
 * 
 * @author Anjoulie Alhaj 
 */
public class C2_2 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        
        final double PI = 3.1415;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        //calculate area
        double area = Math.pow(radius, 2)*PI;
        System.out.print("The area is " +area);
        
        //calculate volume 
        double volume = area * length;
        System.out.print(" The volume is " +volume);
       
    }
}
