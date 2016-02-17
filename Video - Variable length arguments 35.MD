**************************************************
==================================================
JAVA - Bucky video 35 (Variable length Arguments)
==================================================
**************************************************

This used when we don't know how many arguments the class will take and is denoted by ellipses (...) in place of arguments.

Below is an example of a class to get the average of list of numbers.


public class main34 {

	public static void main(string[] args)
	{
		System.out.println(average(43, 56,76,90));
		
	}

	public static int avg(int...numbers) {
		int total=0;
		for(int x:numbers)
			total+=x;

		return total/numbers.length;
		
	}
}

	OUTPUT:
 Average of the numbers input.
