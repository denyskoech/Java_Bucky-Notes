*************************************************************
=============================================================
JAVA - Bucky video 17 (constructors)
=============================================================
*************************************************************


- Constractor allows you to initialize variables as soon as you instatiate an object instead of empty parameters you can pass arguments in them.
- Constructor method has to have the same name as the name of the file that it being created from.
- It is a cool thing because whenever you instantiate an object you can initialize to it's own different set of values 


public class name {
	private String girlName;

	public name (String name) { //constructor
		girlName=name; 
	}
	public void setName(String name)
	{
		girlName=name;
	}
	public String getName () {
		return girlName;
	}
	public void saying () 
	{
		System.out.printf("Your first girlfriend was %s", getName());
	}	
}

public class main {
	public static void main(string[] args)
	{
		name nameObject = new name("Manny");
		nameObject.saying();

	}
}

	OUTPUT: Your first girlfriend was Manny

