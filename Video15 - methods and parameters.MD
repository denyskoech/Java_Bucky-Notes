
**********************************************
==============================================
JAVA - Bucky Video 15 (methods and parameters)
==============================================
**********************************************

Scope
-----

Using methods with parameters and create a funtion that will allow the user to enter their name and we access the namein our function.


import java.util.Scanner;
public class name {
	public static void main(string[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter your name here");
		String name = input.nextLine();

		System.out.println("Hello " + name);

	}

}

	OUTPUT: prompt for user input the print out "Hello userinput" 

To Note
-------

argument / parameters - any extra data that a method needsto work
if you are using another object to print out the message you have to create an istance of the object by using new, then to call the function you use objectName.methodtobecalled(parameterittakes for the above example = name).
nextLine() - used when the value that is expected is a string