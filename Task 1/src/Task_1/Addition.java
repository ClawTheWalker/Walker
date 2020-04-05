package Task_1;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 1                                                            *//
//* Description: Sums two numbers together                                  *//
//* Date: 28/01/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

import java.util.Scanner;

public class Addition {
	
	//Declare the explicitly initialise the class instance fields
	private static int newInput = 0;
	private static int newInput2 = 0;
	private static int sum = 0;
	
	//Declare the object in of class Scanner
	private static Scanner in;
	//-------------------------------------------------------------//
	
	
	public static void main( String[] args ) {
		
		//Instantiate the object in of the class Scanner
		in = new Scanner( System.in );
		
		//ask for user to enter the first integer
		System.out.println( "Please enter your first number: " );
		//read-in the first integer entered by the user (keyboard)
		newInput = in.nextInt();
		
		//ask for user to enter the second integer
		System.out.println( "Please enter your second number: " );
		//read-in the second integer entered by the user (keyboard)
		newInput2 = in.nextInt();
		
		//Sums the two numbers together
		sum = newInput + newInput2;
		//Prints the sum of the two numbers
		System.out.print( "The computed sum of the addition is: " + sum );
		
		//close the keyboard input source for avoiding data corruption
		in.close();
	}

}
