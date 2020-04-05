package Task_3;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 3                                                            *//
//* Description: Course Stats                                               *//
//* Date: 18/02/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class CourseStatsB {
	private static int passes = 0;
	private static int failures = 0;
	
	public static void main ( String[] args ) {
		
		//Give the frame a name for the app so it will open
		JFrame statsFrame = new JFrame( "CourseStats");
		
		//Starts the index of the students
		int student = 1;

		//The "while" loops through the code until there is 20 students.
		while ( student <= 20 ) {
			
			//Asks the user to input whether the student passes or failed
			int stat = Integer.parseInt( JOptionPane.showInputDialog( "Student  " + student + ": " ));
			
			//This check if the user inputed passed or failed for the student
			if ( stat == 1 ) { passes++; }else if ( stat == 2 ) { failures++; };
			
			//counts the student into the index allowing the loop to go to the next student
			student++;
		}
		
		//Shows results
		JOptionPane.showMessageDialog( statsFrame, "Passed: " + passes + ", Failed: " + failures );
		
		//if 16 or more students passed the Tuter is congratulated
		if ( passes >= 16 ) {
			JOptionPane.showMessageDialog( statsFrame, "Congratulations Tuters!" );
			
		}
		//Close the program
		System.exit(-1);
	}


}
