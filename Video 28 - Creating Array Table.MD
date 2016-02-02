**********************************************
==============================================
JAVA - Bucky video 28 (Creating an Array Table)
==============================================
**********************************************

Creating tables of arrays:


public class main27 {

	public static void main(string[] args)
	{
		System.out.println("Index\tValue");
		int arr[]={32, 18};

		for(int counter=0;counter<arr.length;counter) {
			System.out.println(counter + "\t" + arr[counter] )
		} 

	}
}

	OUTPUT: Index	Value
		  0	  32
		  1	  18

Worth noting
------------

- Arrays have properties example to store the number of elements in the array is stored in and can be accessed through arrayname.length will get the length/ number of values in the array.