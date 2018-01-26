package Chapter8;

import java.util.Scanner;

/**
 *Program to make a chart of how many sales 4 different salesmen did in a 5 day week 
 * 
 * @author Anjoulie Alhaj
 */

public class P8 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char orNah = '1';
        double[][] chart = new double[4][5];
        char[] saleVars = {'A', 'B', 'C', 'D'};
        char person;
        char day; 
        
        do{
            do{
                //asking which salesman the info will be about
                System.out.println("Enter the salesman ID as A, B, C, or D: ");
                person = input.next().toUpperCase().charAt(0);
            }while(person != 'A' && person != 'B' && person != 'C' && person != 'D');
            
            do{
                //asking which day the info is from 
                System.out.println("Enter the days as M, T, W, H, or F: ");
                day = input.next().toUpperCase().charAt(0);
            }while(day != 'M' && day != 'T' && day != 'W' && day != 'H' && day != 'F');
            
            System.out.println("Enter the amount of the sale for ");
            double sale = input.nextDouble();
            chart[worker(person)][worker(day)] += sale;
            
            do{
                System.out.println("More Data? Enter Y for more or N to stop: ");
                orNah = input.next().toUpperCase().charAt(0);
                
            }while(orNah != 'N' && orNah != 'Y');
         
        }while(orNah == 'Y');
        
        //top part of chart
        System.out.println("Salesman     M     T     W      H      F");
        for(int i = 0; i < chart.length; i++){
            System.out.print(saleVars[i] + "            ");
            for(int w = 0; w < chart[i].length; w++){
                
                System.out.printf("%.2f  " ,chart[i][w]);
            }
            System.out.println(" ");
        }
        
    } 
    
    /**
     * Method to determine where in the chart information given by user goes 
     * 
     * @param id the worker or what day they worked
     * @return where in the chart information goes 
     */
    public static int worker(char id){
        int y = -1;
        switch(id){
            case 'A': y = 0;
                break; 
            case 'B': y = 1;
                break;
            case 'C': y = 2;
                break;
            case 'D': y = 3;
                break;
            case 'M': y = 0;
                break;
            case 'T': y = 1;
                break;
            case 'W': y = 2;
                break;
            case 'H': y = 3;
                break;
            case 'F': y = 4;
                break;
            
        }
        return y; 
    }
}
