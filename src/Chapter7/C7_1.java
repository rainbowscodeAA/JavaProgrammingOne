package Chapter7;

import java.util.Scanner;

/**
 *Program to determine the letter grades of student scores based on the highest student score given
 * 
 * @author Anjoulie Alhaj
 */
public class C7_1 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");

        int [] students = new int [input.nextInt()];

        

        System.out.println("Enter " + students.length + " scores: ");

        for(int i = 0; i < students.length; ++i) {

            students[i] = input.nextInt();
        }

        //find the largest number in the array 
        int best = students[0];

        for(int n = 1; n < students.length; n++){

            if(students[n] > best)

                best = students[n];
        }

        //determine the students grades based on the best score in the group
        for(int v = 0; v < students.length; v++){

            if(students[v] >= (best - 10))

                System.out.println("Student " +v+ " score is " +students[v]+ " and grade is A");

            else if(students[v] >= (best - 20))

                System.out.println("Student " +v+ " score is " +students[v]+ " and grade is B");

            else if(students[v] >= (best - 30))

                System.out.println("Student " +v+ " score is " +students[v]+ " and grade is C");

            else if(students[v] >= (best - 40))

                System.out.println("Student " +v+ " score is " +students[v]+ " and grade is D");

            else 

                System.out.println("Student " +v+ " score is " +students[v]+ " and grade is F");   

        }

    } 


    
}
