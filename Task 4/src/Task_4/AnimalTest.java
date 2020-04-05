package Task_4;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 4                                                            *//
//* Description: Inheritance                                                *//
//* Date: 03/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

public class AnimalTest {
	
	public static void main ( String[] args ) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Lion lion = new Lion();
		
		//Retrieves methods from animals and specific methods
		dog.bark();
		dog.sleep();
		dog.move();
		
		cat.meow();
		cat.sleep();
		cat.move();
		
		lion.roar();
		lion.eat();
		lion.move();
	}

}
