************************************************************
============================================================
JAVA - Bucky video 37 (Display time in 12 hour clock system)
============================================================
************************************************************

The following example will be used to return time in regular AM /PM (12 hour clock system).


public class main36 {

	public static void main(string[] args)
	{
		
		notmain notmainObject = new notmain();
		System.out.println(notmainObject.toMilitary);
		System.out.println(notmainObject.toString);

		notmainObject.setTime(15, 56, 9);
		notmainObject.setTime(15, 56, 9);
		System.out.println(notmainObject.toMilitary);
		System.out.println(notmainObject.toString);

		
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

	public string toString() {
((
		return String.format("%02d:%02d:%02d", ((hour==0||hour==12)?12:hour%12), minute, second );


}