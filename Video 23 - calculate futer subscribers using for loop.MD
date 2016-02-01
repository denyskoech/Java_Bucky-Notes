*************************************************************
=============================================================
JAVA - Bucky video 22 (Application of for loop)
=============================================================
*************************************************************

The program below is to calculate the amount of subcribers in the future using compound interest formular (to calculate future interest in accounts).

A = P (1+R)^n
A - Amount what we are calculating
P - Principal , initial amount
R - rate
^ - to the power
n - Number of years


public class main22 {

	public static void main(string[] args)
	{

		double amount;
		double principal = 10,000;
		double rate = .01;
	
		for (int day=1; day<=20;day++) {
			amount=principal*Math.pow(1+rate, day);
			System.out.println(day + " " + amount)		
		}
	}
}

To note
-------

We use Math.pow to get the power of a number.
- The value of day increases with every loop and the new amount printed out.