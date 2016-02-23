************************************************************
============================================================
JAVA - Bucky video 40 (SET and GET methods)
============================================================
************************************************************

The example below we will be looking at at SET and GET methods.

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

	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);		
	}

	public void setHour(int h){
		hour = ((h>=0&&h<24)?h:0);
	}

	public void setMinute(int m){
		minute = ((m>=0&&m<60)?m:0);
	}

	public void setSecond(int s){
		second = ((s>=0&&s<60)?s:0);
	}

	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}

	public string toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute, 			getSecond);
	}

}


	
------------
Worth noting
------------

- We need the set methods becausewe have to check whether the hour, minute, seconds enetered are valid numbers and if not then they set it to 0.
