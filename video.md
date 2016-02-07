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

Worth noting
-------------
- The name that you give to yourclass should be the same as the name of your java file.
-Print Vs println- print doesnt cause a character change after printing and println does.


******************
Exception Handling
******************
In example one above the class only checks if the user input is an integer and then prints it out if it is but suppose the value entered by the user is not an integer then the program will crash. 

This is where exception handling comes in. To provide another action if the input is not of the expexcted type to catch the errors using an else statement. See the example below on how to make the class above better.

---------
Example 2
---------


import java.util.Scanner;

public class <classname> 
{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("Your favorite number");
		if (userInput.hasNextInt())
		{
			
			int numberEntered = userInput.nextInt();
			System.out.println("You entered " +numberEntered);

		} else {
			
			System.out.println("Enter an integer next time");
		
		}

	}
}

OUTPUT: will print Your favorite number: and wait for your 			input and if it is a number it will print out 'You 			entered	yournumber' if it not a number then it will			print out 'Enter an integer next time'.

Worth noting
-------------
if you want to check whether an array has other value types like hasNextInt above you just use:
hasNextDouble() - for double
hasNextLine() - for string
hasNextByte() - for byte
... so on so forth and to output is .nextLine() for string :)

***********************
Mathematical Operations
***********************
You can perform various mathematical operations with jave and the operational expressions are just the usual mathematical opearitons
+ : for addition
- : for subtraction
* : for multiplcation
/ : for division
% : Gives remeinder of a multiplication expression

You can do a bunch of things with them. See below

---------
Example 3
---------
import java.util.Scanner;

public class <classname> 
{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("Your favorite number");
		if (userInput.hasNextInt())
		{
			
			int numberEntered = userInput.nextInt();
			System.out.println("You entered " +numberEntered);
			int numberEnteredTimes2 = numberEntered * 2;
			int numberEnteredMinus2 = numberEntered - 2;
			int numberEnteredDivide2 = numberEntered / 2;
			int numberEnteredPlus2 = numberEntered + 2;
			system.out.println(numberEntered + " * 2 = " numberEnteredTimes2);
			
		} else {
			
			System.out.println("Enter an integer next time")
		
		}

	}
