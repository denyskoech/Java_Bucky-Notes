************************************************************
============================================================
JAVA - Bucky video 38 (private, public and this)
============================================================
************************************************************

Public and private are visibility levels of varibles within and without a class, whereby :
-: private means it is only visible and accessible within the class that is was declared.
-: Public on the other hand means that the variable can be accessed inside and outside the class.

Needless to say private variables can be accessed by the use of 'this' keyword.It can be useful where the constructor variables are identical to the instance variables, java looks at the local variables and to overpower that we use this statement to refer to the instance variables.

See the below example on how it is used. 


public class main36 {

	public static void main(string[] args)
	{
		
		notmain notmainObject = new notmain();
		System.out.println(notmainObject.toMilitary);
		System.out.println(notmainObject.toString);

		notmainObject.setTime(15, 56, 9);
		System.out.println(notmainObject.toMilitary);
		System.out.println(notmainObject.toString);

		
	}
}


Public class notmain {	
	private int hour = 1;
	private int minute = 3;
	private int second = 5;

	public void setTime(int hour, int minute, int second) {
			
		this.hour = 4;
		this.minute = 6;
		this.second = 8;
		//hour = 4;
		//minute = 6;
		//second = 8;

	}

	public string toMilitary() {

		return String.format("%02d:%02d:%02d", hour, minute, second );

	public string toString() {
((
		return String.format("%02d:%02d:%02d", ((hour==0||hour==12)?12:hour%12), minute, second );


}


	OUTPUT USING this: 	01:03:05
				01:03:05 AM
				04:06:08
				04:06:08AM

	OUTPUT without this:	01:03:05
				01:03:05 AM
				01:03:05
				01:03:05 AM