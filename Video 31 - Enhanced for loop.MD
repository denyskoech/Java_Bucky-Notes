**************************************************
==================================================
JAVA - Bucky video 30 (Enhanced for statement)
==================================================
**************************************************

Example to get the sum of the elements in an array using enhanced for loop.


public class main29 {

	public static void main(string[] args)
	{
		int arr[]={32, 18, 78, 34, 56, 1};
		int sum=0;

		for(int x: arr) {
			sum+=x;
		} 
	 	System.out.println(sum )
	}
}

	OUTPUT: The sum of these numbers is 219

Note
----

Enhanced for loop takes type and identifier, and array name seperated by :
