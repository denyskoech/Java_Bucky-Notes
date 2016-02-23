************************************************************
============================================================
JAVA - Bucky video 39 (Overloaded/multiple constructors)
============================================================
************************************************************

You can build multiple constructors with the same name as the class and depending on the number of arguments java chooses which constructor to use.

Example
-------

Public class notmain {	
	private int hour;
	private int minute;
	private int second;

	public void notmain() {
			
		this(0,0,0);

	}
	public void notmain(int h) {
			
		this(h,0,0);

	}
	public void notmain(int h, int m) {
			
		this(h,m,0);

	}
	public void notmain(int h, int m, int s) {
			
		setTime(h,m,s);

	}

	Public void setTime(int h, int m, int s) {

		setHour(h);
		setMinute(m);
		setSecond(s);
		
	}

}


------------
Worth noting
------------

-Use this keyword to give a constructor the expected maximum number of arguments 
- If a user enters one argument it will look for the constructor with one argument and set it as the hour and the rest set to zero and it will look for  the constructor with three argumets and run it (in this case it will set the time), so on so forth.