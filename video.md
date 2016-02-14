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



	OUTPUT: will print Your favorite number: and wait for your 			input and if it is a number it will print out 'You 			entered	yournumber' then 'yournumber * 2 = 				yournumbertimes2' if it not a number then it will print 		out 'Enter an integer next time'.

Worth noting
------------
If you had a variable initiated to a value and wanted to perform an action on the value and save it back to it you could do a shorthand. Example to save numberEnteredTimes2

istead of : int numberEnteredTimes2 = numberEntered * 2
We could do: int numberEnteredTimes2 *= 2

increament by 1: numberEntered++;
increament by 2: numberEntered+2;
Decreament by 1: numberEntered--;
Decreament by 2: numberEntered-2;

Java has inbuilt math library to amp our experience, check out example

Math.abs(numberEntered) - finds the absolute of numberEntered.
Math.max(x, y) - Find max number
Math.min(x, y) - Find minimum number
Math.sqrt(numberEntered) - find squareroot (ensure variable type is double)
Math.ceil - round up a number (1.45 will be 2)
Math.floor - round down a number (1.45 will be 1)
Math.round - rounding off a number (1.45 will be 1 while 1.7 will be 2)
Math.random - Find random numbers (Math.random()*10 between 0 & 11)

