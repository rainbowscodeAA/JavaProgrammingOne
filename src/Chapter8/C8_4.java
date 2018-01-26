package Chapter8;

/**
 *Program to organize the hours that 7 employees worked 
 * 
 * @author Anjoulie Alhaj
 */

public class C8_4 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    
    public static void main(String[] args){
    
        //hours each employee worked through week

        int[][] times ={

        {2, 4, 3, 4, 5, 8, 8},

        {7, 3, 4, 3, 3, 4, 4},

        {3, 3, 4, 3, 3, 2, 2},

        {9, 3, 4, 7, 3, 4, 1},

        {3, 5, 4, 3, 6, 3, 8},

        {3, 4, 4, 6, 3, 4, 4},

        {3, 7, 4, 8, 3, 8, 4}, 

        {6, 3, 5, 9, 2, 7, 9},

        };

        //employees
        int[] employee = {0, 1, 2, 3, 4, 5, 6, 7};

        System.out.println("              Su  M   T   W   Th  F  Sa    Total");

        for(int r = 0; r < times.length; r++){

            System.out.print("Employee " + r + "    ");

            int total = 0; 

            for(int c = 0; c < times[r].length; c++){

                total += times[r][c]; 

                System.out.print(times[r][c] + "   ");
            } 

            System.out.print("  " +total);

            System.out.println(" ");

        }
    }
}
