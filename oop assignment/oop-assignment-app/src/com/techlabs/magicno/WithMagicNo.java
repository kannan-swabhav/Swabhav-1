package com.techlabs.magicno;

public class WithMagicNo {
	
	public static void main(String[] args)
	{
		final int SPAN_OF_LEAP_YEAR=4;
		//final int CURRENT_YEAR=2016;
		//final int CURRENT_YEAR=2018;
		//final int CURRENT_YEAR=2015;
		final int CURRENT_YEAR=2020;
		//final int CURRENT_YEAR=null;
		
		if(CURRENT_YEAR%SPAN_OF_LEAP_YEAR==0)
			System.out.println(CURRENT_YEAR + " is a leap year");
		else
			System.out.println(CURRENT_YEAR + " is not a leap year");
	}

}
