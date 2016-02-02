**************************************************
==================================================
JAVA - Bucky video 29 (summing Elements of Arrays)
==================================================
**************************************************

Example to get the sum of the elaments in an array.


public class main29 {

	public static void main(string[] args)
	{
		int arr[]={32, 18, 78, 34, 56, 1};
		int sum=0;

		for(int counter=0;counter<arr.length;counter) {
			sum+=arr[counter];
		} 
	System.out.println("The sum of these numbers is "  + sum )
	}
}

	OUTPUT: The sum of these numbers is 219

TO break it down
----------------

- Initialize an array
- Declare a variable to the the sum total and initialize it to 0
- use a for loop to iterate through every element of the array from index zero and loop for as long as counter is less than the length of the array (counts from 0).