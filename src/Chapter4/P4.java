package Chapter4;

import java.util.Scanner; 

/**
 *Program to calculate which worker got paid more 
 * 
 * @author Anjoulie Alhaj
 */
public class P4 {
    /**
     * Main Method 
     * 
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //first bidder information
        System.out.println("What is the name of the first bidder? ");
        String name1 = input.nextLine();
        System.out.println("How many hours of work will " +name1+ " require?");
        int hours1 = input.nextInt();
        System.out.println("How much does " +name1+ " charge per hour?");
        double costPH1 = input.nextDouble();
    
        //second bidder information 
        System.out.println("What is the name of the second bidder? ");
        String name2 = input.next();
        System.out.println("How many hours of work will " +name2+ " require?");
        int hours2 = input.nextInt();
        System.out.println("How much does " +name2+ " charge per hour?");
        double costPH2 = input.nextDouble();
        
        //overall cost for bidder 1
        double cost1 = Math.round(costPH1 * hours1);
        
        //overall cost for bidder 2 
        double cost2 = Math.round(costPH2 * hours2);
        
        //is 1 less than
        if(cost1 < cost2){
            System.out.println("The winner is " +name1);
            System.out.printf("Total cost is $%.2f", cost1);
        }
        
        //is 2 less than 
        else if(cost1 > cost2){
            System.out.println("The winner is " +name2);
            System.out.printf("Total cost is $%.2f", cost2);
        }
        
        // Do 1 and 2 have equal costs
        if(cost1 == cost2){
            
            //if 1 has less hours
            if(hours1 < hours2){
                System.out.println("The winner is " +name1);
                System.out.printf("Total cost is $%.2f %n", cost1);
                System.out.println("The number of hours is " +hours1);
            }
            //if 2 has less hours
            else if(hours1 > hours2){
                System.out.println("The winner is " +name2);
                System.out.printf("Total cost is $%.2f %n", cost2);
                System.out.println("The number of hours is " +hours2);
            }
            //if 1 and 2 have equal hours
            else if(hours1 == hours2){
                System.out.println("Both " +name1+ " and " +name2+ " have identical bids.");
                //number of hours
                System.out.println("Number of hours: ");
                System.out.println("First bidder = " +hours1+ "     Second bidder = " +hours2);
                //hourly cost
                System.out.println("Cost per hour: ");
                System.out.printf("First bidder = $%.2f     Second bidder = $%.2f %n" , costPH1 , costPH2);
                System.out.println();
                //total cost
                System.out.println("Total Cost: ");
                System.out.printf("First bidder = $%.2f     Second bidder = $%.2f", cost1, cost2);
            }
        }  
    } 
}
