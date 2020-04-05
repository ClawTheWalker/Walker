package Task_2;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 2                                                            *//
//* Description: Bank Account                                               *//
//* Date: 11/02/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

public class BankAccountTest {

	public static void main ( String[] args ) {
		//Bank accounts
		BankAccount account0 = new BankAccount( "John", 2100.00 );
		BankAccount account1 = new BankAccount( "Tiago", 120.00 );
		
		//Prints out the names of the accounts and the balance of each one
		System.out.printf("Account Name: %s \n Balance: %f \n", account0.getName(), account0.getBalance());
		System.out.printf("Account Name: %s \n Balance: %f \n", account1.getName(), account1.getBalance());
	}
}
