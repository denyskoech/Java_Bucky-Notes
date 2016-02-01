*************************************************************
=============================================================
JAVA - Bucky video 21 (Put it all together)
=============================================================
*************************************************************

A simple program to include all the basic tools.

Input 10 numbers and get the average.
-------------------------------------

import java.util.Scanner;

public class main {
	public static void main(string[] args)
	{
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;

		while (counter < 10) {
			grade = input.nextInt();
			total += grade;
			counter++;
		}
		average = total/10;		
		System.out.println("Your average is" + average);

	}
}


	OUTPUT: request for 10 numbers, adds them and then finds the average.


Break it Down
-------------

- declare all the variables we will need 
	total - will store the sum of all the 10 numbers
	grade - will take the input of the user
	average - Will store the value of the average value
	counter - will keep count of the loops to ensure it is does not 			exceed the required number.
- Initialize total and counter to 0 
- The while statement will keep count of the loops and store it in counter and since the program takes in 10 numbers the loop should run while counter is less than 10 (counts from 0-9 which is 10 loops).
- While the while statement is true user input is stored in grade and then added to total and the counter is increased by 1.
- After the while loop is complete we take total divide by 10 and store it in the average variable and print it out.
