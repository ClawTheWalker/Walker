package Task_2;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 2                                                            *//
//* Description: Bank Account                                               *//
//* Date: 11/02/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BankAccountApp {
	private static BankAccount[] bankAccounts;
	
	public static void main ( String[] args ) {
		//Bank account array
		bankAccounts = new BankAccount[] { new BankAccount( "", 0 ), new BankAccount( "", 0) };
		
		//Give the frame a name for the app so it will open
		JFrame bankFrame = new JFrame( "BankApp");
		
		
		//Asks the user for the name of Each accounts
		String[] name = new String[2];
		name[0] = JOptionPane.showInputDialog( "What is your first account name?");
		name[1] = JOptionPane.showInputDialog( "What is your second account name?");
		
		
		//Asks the user for a balance for both the accounts
		double[] money = new double[2];
		money[0] = Double.parseDouble( JOptionPane.showInputDialog( "What is the balance of your first account?"));
		money[1] = Double.parseDouble( JOptionPane.showInputDialog( "What is the balance of your second account?"));
		
		
		//Takes the info inputed by the user
		bankAccounts[0].setName( name[0] ); bankAccounts[0].payin( money[0] );
		bankAccounts[1].setName( name[1] ); bankAccounts[1].payin( money[1] );
		
		//Shows the user the information they set to the accounts
		JOptionPane.showMessageDialog( bankFrame, bankAccounts[0].getName() + "'s account has " + bankAccounts[0].getBalance() + " £ ");
		JOptionPane.showMessageDialog( bankFrame, bankAccounts[1].getName() + "'s account has " + bankAccounts[1].getBalance() + " £ ");
		
		//Close the program
		System.exit(-1);
	}

}
