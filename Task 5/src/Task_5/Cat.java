package Task_5;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 5                                                            *//
//* Description: Polymorphism                                               *//
//* Date: 10/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

//Connected to parent class Animal
public class Cat extends Animal {
	
	public Cat( String owner ) {
		super( owner );
	}
	
	//Method specific to this animal
	public void meow () {
		System.out.println( "Meow!" );
	}
	public void move() {
		System.out.println( "Jumping" );
	}
	public void makesSound() {
		System.out.println( "The cat does meow!" );
	}

}
