package com.techlabs.magicno;

public class WithoutMagicNo {

	public static void main(String[] args)
	{
		//final int CURRENT_YEAR=2016;
		//final int CURRENT_YEAR=2018;
		//final int CURRENT_YEAR=2015;
		final int CURRENT_YEAR=2020;
		//final int CURRENT_YEAR=null;
		
		if(CURRENT_YEAR%4==0)
			System.out.println(CURRENT_YEAR + " is a leap year");
		else
			System.out.println(CURRENT_YEAR + " is not a leap year");
	}
}
