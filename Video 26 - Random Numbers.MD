******************************************
==========================================
JAVA - Bucky video 26 (Random Numbers)
==========================================
******************************************

Build random number generator.

import java.util.Random;

public class main22 {

	public static void main(string[] args)
	{
		Random dice = new Random();
		int number;

		for (int counter=1; counter<=10;counter++) {
			number= dice.nextInt(6);
			System.out.println( number + " ");
		}

	}
}

	OUTPUT: random numbers 0-5

To Note
-------

Random counts from 0, if you want the range to start from 1, you add 1 to our dice object.

import java.util.Random;
public class main26 {

	public static void main(string[] args)
	{
		Random dice = new Random();
		int number;

		for (int counter=1; counter<=10;counter++) {
			number= 1+dice.nextInt(6);
			System.out.println( number + " ");
		}

	}
}

	OUTPUT: random numbers 1-6	 