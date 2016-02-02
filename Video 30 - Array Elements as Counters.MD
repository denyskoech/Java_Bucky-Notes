**************************************************
==================================================
JAVA - Bucky video 30 (Array Elements as counters)
==================================================
**************************************************

Example to get the sum of the elaments in an array.

iport java.util.Random;
public class main30 {

	public static void main(string[] args)
	{
		Random rand = new Random();		
		int arr[]=new int[7];
		
		for(int roll=1;roll<1000;roll++) {
			++arr[1+rand.nextInt(6)];
		} 
		System.out.println("Face\tFrequency");

		for(int face=1;face<arr.length;face++) {
		System.out.println(face+"\t"+arr[face]);
		}
	}
}

	OUTPUT: The sum of these numbers is 219

break it down
-------------

- Import Random class
- Instatntiated the random class
- Declared a new array with a length of 7
- created a for loop to start at index[1] 
- Inside the loop we made a random number generator to roll the numbers from 0 through 5 and move it over so it rolls 1-6 by adding 1+, everyttime it rolls to one of the numbers it increaments arr by one therefore keeping count of the number of times an index gets a hit.
- Made an array table
- Then we printed the array table starting at index 1 (because at index[0] the value is 0 because there is no side with value of 0) and increament by one.