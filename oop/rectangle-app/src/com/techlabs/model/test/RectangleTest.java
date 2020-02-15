package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle small=new Rectangle();
		small.width=10;
		small.height=5;
		int areaOfSmall = small.calculateArea();
		System.out.println("Width of the small rectangle is "+ small.width );
		System.out.println("Height of the small rectangle is "+ small.height);
		System.out.println("Area of the small rectangle is "+ areaOfSmall + "\n" );
		
		Rectangle big=new Rectangle();
		big.width=100;
		big.height=50;
		int areaOfBig = big.calculateArea();
		System.out.println("Width of the big rectangle is "+ big.width );
		System.out.println("Height of the big rectangle is "+ big.height);
		System.out.println("Area of the big rectangle is "+ areaOfBig );
	}
}
