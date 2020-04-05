package Task_5;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 5                                                            *//
//* Description: Polymorphism                                               *//
//* Date: 10/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

//Connected to parent class Animal
public class Lion extends Animal {
	
	public Lion( String owner ) {
		super( owner );
	}
	
	//Method specific to this animal
	public void roar() {
		System.out.println( "Roooaar!" );
	}
	
	public void move() {
		System.out.println( "Sitting" );
	}
	public void makesSound() {
		System.out.println( "The lion roars!" );
	}

}
