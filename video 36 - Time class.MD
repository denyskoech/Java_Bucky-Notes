**************************************************
==================================================
JAVA - Bucky video 36 (Time class)
==================================================
**************************************************

A time class is a seperate class that has different time functions 

In the example below, a user will input three numbers, for min, hour and seconds and the class will translate it to military time (24 hour clock system) and regular time (12 hour clock system).

public class main36 {

	public static void main(string[] args)
	{
		
		notmain notmainObject = new notmain();
		System.out.println(notmainObject.toMilitary);
		notmainObject.setTime(15, 56, 9);
		
	}
}


Public class notmain {	
	private int hour;
	private int minute;
	private int second;

	public void setTime(int h, int m, int s) {
			
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);

	}

	public string toMilitary() {

		return String.format("%02d:%02d:%02d", hour, minute, second );


}

	OUTPUT: 15:56:09


