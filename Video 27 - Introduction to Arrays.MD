**********************************************
==============================================
JAVA - Bucky video 27 (Introduction to Arrays)
==============================================
**********************************************

An rray is a variable that can store many values in it and can only store values of the same value type.


public class main27 {

	public static void main(string[] args)
	{
		int number[]=new int[10];

		number[0]=20;
		number[1]=80;
		number[9]=70;
		
		System.out.println(number[1]);

	}
}

	OUTPUT: 80

To note
-------
- You have to create an instance of the array class and the type of data it will hold
- Arrays stores values from index/position 0.
- To reference an array you write the name of the arrayname[index of the value]


You dont have to type all the variables when creating it, you can create an array initializer, to initialize the array without type arrayname[index] see below:


public class main27 {

	public static void main(string[] args)
	{
		int number[]={20, 33, 14, 65, 26,97};

		System.out.println(number[5]);

	}
}

	OUTPUT: 97

The array object will count the number of values for you and can still be accessed through their respective indices.