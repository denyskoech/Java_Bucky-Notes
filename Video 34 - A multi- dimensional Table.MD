**************************************************
==================================================
JAVA - Bucky video 34 (Multi Dimensional Arrays)
==================================================
**************************************************
Making a visual table to display a multi-dimensional table

public class main34 {

	public static void main(string[] args)
	{
		int arr1[][]={{32, 18, 78}, {34, 56, 1}};
		int arr2[][]={{32, 18}, {34, 56, 1}, {78}};

		System.out.println("first array");
		display(arr1);

		System.out.println("Second");
		display(arr2);
		
	}

	public static void display(int x[][]) {
		for (int row=0;row<x.length;row++){
			for (int column=0;column<x[row].length;column++) {
				system.out.print(x[row][column]+"\t");

			}
			System.out.println();
		}
	}
}

	OUTPUT: first array 
		32 18 78
		34 56 1
		Second
		32 18
		34 56 1
		78

 
----------------
Worth Noting
----------------
- Loop for columns in inside the loop through rows.
 