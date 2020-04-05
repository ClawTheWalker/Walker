package Task_5;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 5                                                            *//
//* Description: Polymorphism                                               *//
//* Date: 10/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

//Connected to parent class Animal
public class Dog extends Animal {
	
	public Dog( String owner ) {
		super( owner );
	}
	
	//Method specific to this animal
	public void bark() {
		System.out.println( "Woof!" );
	}
	
	public void move() {
		System.out.println( "Running" );
	}
	public void makesSound() {
		System.out.println( "The dog barks!" );
	}

}