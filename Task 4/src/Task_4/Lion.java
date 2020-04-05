package Task_4;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 4                                                            *//
//* Description: Inheritance                                                *//
//* Date: 03/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

//Connected to parent class Animal
public class Lion extends Animal {
	
	//Method specific to this animal
	public void roar() {
		System.out.println( "Roooaar!" );
	}
	
	public void move() {
		System.out.println( "Sitting" );
	}

}
