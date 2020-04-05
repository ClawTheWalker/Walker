package Task_2;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 2                                                            *//
//* Description: Bank Account                                               *//
//* Date: 11/02/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

public class BankAccount {
	private String name;
	private double balance;
	
	//Constructor Method
	BankAccount( String n, double b ){
		this.name = n;
		this.balance = b;
	}
	
	//Method to retrieve name from another class
	public String getName() {
		return name;
	}
	//Method to retrieve balance from another class
	public double getBalance() {
		return balance;
	}
	//Method  to change the name on the Constructor Method
	public void setName ( String n ) {
		this.name = n;
	}
	
	//Method payin required to view balance from another class
	public void payin ( double amount) {
		this.balance += amount;
	}

}
