package Task_5;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 5                                                            *//
//* Description: Polymorphism                                               *//
//* Date: 10/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

public class Animal {
	public boolean isAPet = true;
	public String owner = "John";
	
	public Animal( String owner ) {
		this.setOwner( owner );
	}
	
	//Methods available for all animals
	public void sleep () {
		System.out.println( "Sleeping" );
	}
	
	//Methods available for all animals
	public void eat () {
		System.out.println( "Eating" );
	}
	public void makeSound () {
		System.out.println( "Animal makes sound" );
	}
	//Method to return owner
	public String getOwner () {
		return owner;
	}
	//Method to change owner
	public void setOwner ( String owner ) {
		this.owner = owner;
	}

}
