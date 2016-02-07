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

OUTPUT: will print Your favorite number: and wait for your 				input and if it is a number it will print out 'You entered 		your number'.


Now to break it down
--------------------
import - used to import external classes
Scanner - Class that is used to accept input from user. To use the scanner you need to create a new scanner object in evry class that you intend to use it by using keyword 'new' and inside the Scanner() parantheses we define the input string that you want the Scanner() to look at.
System.in - Listens to the input from the keyboard
.hasNext - used to check if the next value in the entered has a certain value or type(by adding .<type>).