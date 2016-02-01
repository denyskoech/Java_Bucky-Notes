*************************************************************
=============================================================
JAVA - Bucky video 19 (else if statements)
=============================================================
*************************************************************

else - if
---------
It is a way of giving java more than two options.
syntax:start with if, then the else if statements (as many as you wish) and end with an else statement.


public class main {
	public static void main(string[] args)
	{
		int age = 55;

		if (age >= 60) {
			System.out.println("You are in your 60's");
		} else if (age >= 50) {
			System.out.println("You are in your 50's");
		} else if (age >= 40) {
			System.out.println("You are in your 40's");
		}else {
			System.out.println("You are Young");

		}

	}
}

	OUTPUT: You are in your 50's

How it works
------------

Checks each if, else if , else statements and the first one that returns true will be executed and the program exits.

NOTE
----
- It can only do one of the options given.
- The else statement executes if none of the if statements evaluates to true. 