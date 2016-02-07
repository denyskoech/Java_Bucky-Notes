*************************************************************
=============================================================
JAVA - Bucky video 16 (Multiple methods & Instance variables)
=============================================================
*************************************************************

Execution of multiple classes and instantiating of methods always seem to work backwards from the main method into the classes that are being accessed.

You can use multiple methods within a class

public class name {
	private String girlName;
	public void setName(String name)
	{
		girlName=name;
	}
	public String getName () {
		return girlName;
	}
	public void saying () 
	{
		System.out.printf("Your first girlfriend was %s", getName());
	}	
}

import java.util.Scanner;
public class main {
	public static void main(string[] args)
	{
		Scanner input = new Scanner(System.in);
		name nameObject = new name();
		System.out.println ("Enter your name here:");
		String temp = input.nextLine();
		nameObject.setName(temp);
		nameObject.saying();

	}
}

	OUTPUT: Prompt "Enter your name here" then print out "Your first 		girlfriend was userinput" 


what is happening - break down
------------------------------

- main method imports Scanner method to be able to accept user input
- We inastantiate the Scanner() and name() methods to be able to use them in our main method
- The method takes the input by the user and assigns it to a temporary variable called temp
- We set the temp variable to the girlName variable in the class method
- We then print out the saying () method 

Notes
-----

Private - only the method of the class can use it
printf - when we need to format our output we can use this, another way to print out stuff.
Instance variable - when a variable is outside the methods but is still within the main class.

