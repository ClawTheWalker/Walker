package Task_1;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 1                                                            *//
//* Description: Average of three numbers                                   *//
//* Date: 28/01/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

import java.util.Scanner;

public class Average {
	//Declare the explicitly initialise the class instance fields
	private static int sum = 0;
	private static int div = 0;
	public static void main(String[] args) {
		//Declare the object input of class Scanner
		Scanner input = new Scanner(System.in);
		
		//-------------------------------------------------------------//
		
		
		//Asks for three numbers
		System.out.print("Enter three values: ");
		// read-input the three integer entered by the user (keyboard)
		int numberOne, numberTwo, numberThree, min, max, med;
		numberOne = input.nextInt();
		numberTwo = input.nextInt();
		numberThree = input.nextInt();
		
		//If numberTwo is highest number
		if( numberOne > numberTwo ) {
			if( numberOne > numberThree ) {
				max = numberOne;
				//If numberTwo is the second highest number
				if( numberTwo > numberThree ) {
					med = numberTwo;
					min = numberThree;
				}
				//If numberThree is the second highest number
				else {
					med = numberThree;
					min = numberTwo;
				}
			}
			//If numberOne is the second highest number
			else {
				med = numberOne;
				max = numberThree;
				min = numberTwo;
			}
		}else {
			if( numberTwo > numberThree ) {
				//If numberTwo is the highest number
				max = numberTwo;
				//If numberOne is the second highest number
				if( numberOne > numberThree ) {
					med = numberOne;
					min = numberThree;
				}
				//If numberThree is the second highest number
				else {
					med = numberThree;
					min = numberOne;
				}
			}
			//If numberThree is the highest number
			else {
				med = numberTwo;
				max = numberThree;
				min = numberOne;
			}
		}
		//Prints out the number in order of smallest to biggest
		System.out.println(min);
		System.out.println(med);
		System.out.println(max);
		//Sums the three numbers together
		sum = numberOne + numberTwo + numberThree;
		//Divides the sum of the numbers by 3
		div = sum/3;
		//Prints the average of the three numbers
		System.out.print("The average of those three numbers is: " + div);
		//Close the keyboard input source for avoiding data corruption
		input.close();
	}	
}
