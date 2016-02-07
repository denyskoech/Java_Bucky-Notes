******************************
==============================
JAVA - Tutorial by Derek Banas
==============================
******************************

In Java for us to be able to have certain functionalities we need to import certain classes using the keywrof 'import', exaple 'import java.util.Scanner' is used when we want to accept user input I

If you want to ipmort evrything you use 'java.util.*'.
The example below is a class that will require user input.

---------
Example 1
---------

import java.util.Scanner;

public class <classname> 
{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("Your favorite number:");
		if (userInput.hasNextInt())
		{
			
			int numberEntered = userInput.nextInt();
			System.out.println("You entered " + numberEntered);

		}

	}
}