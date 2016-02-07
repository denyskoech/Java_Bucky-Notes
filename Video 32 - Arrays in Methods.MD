**************************************************
==================================================
JAVA - Bucky video 32 (Arrays in methods)
==================================================
**************************************************


public class main29 {

	public static void main(string[] args)
	{
		int arr[]={32, 18, 78, 34, 56, 1};
		change(arr);

		for(int y: arr) 
			System.out.println(y)
		
	}

	public static void change(int x[]) {
		for (int counter=0;counter<x.length;counter++){
			x[counter]+=5;
		}
	}
}

	OUTPUT: 


To break it Down
----------------

- Declare an array
- Create another method outside the main method but inside the class, that will take variable name [], to imply that it variable that will take one array. 
- The meth