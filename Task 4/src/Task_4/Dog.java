package Task_4;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 4                                                            *//
//* Description: Inheritance                                                *//
//* Date: 03/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

//Connected to parent class Animal
public class Dog extends Animal {
	
	//Method specific to this animal
	public void bark() {
		System.out.println( "Woof!" );
	}
	
	public void move() {
		System.out.println( "Running" );
	}

}
