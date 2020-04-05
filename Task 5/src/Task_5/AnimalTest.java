package Task_5;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 5                                                            *//
//* Description: Polymorphism                                               *//
//* Date: 10/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

public class AnimalTest {
	
	public static void main ( String[] args ) {
		Dog dog = new Dog( "Mike" );
		Cat cat = new Cat( "Alice" );
		Lion lion = new Lion( "Peter" );
		
		//Retrieves methods from animals and specific methods
		dog.makesSound();
		dog.sleep();
		System.out.println( dog.getOwner() );
		
		cat.makesSound();
		cat.sleep();
		System.out.println( cat.getOwner() );
		
		lion.makesSound();
		lion.eat();
		System.out.println( lion.getOwner() );
	}

}
