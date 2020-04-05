package Task_4;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 4                                                            *//
//* Description: Inheritance                                                *//
//* Date: 03/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

//Connected to parent class Animal
public class Cat extends Animal {
	
	//Method specific to this animal
	public void meow () {
		System.out.println( "Meow!" );
	}
	public void move() {
		System.out.println( "Jumping" );
	}

}
