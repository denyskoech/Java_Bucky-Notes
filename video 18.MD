*************************************************************
=============================================================
JAVA - Bucky vide0 18 (Nested if statements and if - else statements)
=============================================================
*************************************************************

if - else
---
Tests a condition and if the condition is true then it execytes the block of statements in the if block.The else statement gives an alternative if the statement is not true.

Nesting if or if - else statement means having an if -else statement inside another if or if - else statement and as shown below.


public class main {
	public static void main(string[] args)
	{
		int age = 60;

		if (age < 50) {
			System.out.println("You are Young");
		} else {
			System.out.println("You are Young");

			if (age < 75) {
				System.out.println("You are really old");
			} else {
				System.out.println("Dont worry you arent realy that old");
			}
		}

	}
}



