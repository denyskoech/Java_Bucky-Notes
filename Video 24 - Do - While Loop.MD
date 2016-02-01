*************************************************************
=============================================================
JAVA - Bucky video 24 (Do - while)
=============================================================
*************************************************************

Used when you have to execute the loop atlease once before checking the condition.

---------
Example 1
---------

public class main22 {

	public static void main(string[] args)
	{

		int counter = 0;

		Do {
			System.out.println(counter);
			 counter++
		} while(counter <= 10);
	}
}

	OUTPUT: print out 1 to 10

---------
Example 2
---------

public class main22 {

	public static void main(string[] args)
	{

		int counter = 15;

		Do {
			System.out.println(counter);
			 counter++
		} while(counter <= 10);
	}
}

	OUTPUT: print out 15

NoTE
----

In Example 2, the loop was executed once even though the condition was false