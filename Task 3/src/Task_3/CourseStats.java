package Task_3;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 3                                                            *//
//* Description: Course Stats                                               *//
//* Date: 18/02/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

import java.util.Scanner;

public class CourseStats {
	
	private static int passes = 0;
	private static int failures = 0;
	
	public static void main ( String[] args ) {
		
		//Allows user input
		Scanner sc = new Scanner( System.in );
		
		//Starts the index of the students
		int student = 1;
		
		//The "while" loops through the code until there is 20 students.
		while ( student <= 20 ) {
			
			//Asks the user to input whether the student passes or failed
			System.out.printf( "Student %s: ", student );
			int stat = sc.nextInt();
			
			//This check if the user inputed passed or failed for the student
			if ( stat == 1 ) { passes++; }else if ( stat == 2 ) { failures++; };
			
			//counts the student into the index allowing the loop to go to the next student
			student++;
		}
		
		//stops the user input
		sc.close();
		
		//Shows results
		System.out.printf( "Passed: %s, Failed: %s\n", passes, failures );
		
		//if 16 or more students passed the Tuter is congratulated
		if ( passes >= 16 ) {
			System.out.println( "Congratulations Tuters!" );
		}
	}

}

