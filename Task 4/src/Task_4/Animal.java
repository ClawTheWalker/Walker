package Task_4;

/*****************************************************************************/
//* Name: 1649395                                                           *//
//* Task: Task 4                                                            *//
//* Description: Inheritance                                                *//
//* Date: 03/03/2020                                                        *//
//*                                                                         *//
/*****************************************************************************/

public class Animal {
	public boolean isAPet = true;
	public String owner = "John";
	
	//Methods available for all animals
	public void sleep () {
		System.out.println( "Sleeping" );
	}
	
	//Methods available for all animals
	public void eat () {
		System.out.println( "Eating" );
	}

}
