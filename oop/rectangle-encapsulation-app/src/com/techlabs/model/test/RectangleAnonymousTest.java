package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleAnonymousTest {
	
	public static void main(String[] args) {
		
	new Rectangle().changeWidth(20);
	new Rectangle().changeHeight(30);
	
	System.out.println("Width " + new Rectangle().readWidth());
	printInfo(new Rectangle());
	

}

public static void printInfo(Rectangle r) {
	System.out.println("Width " + r.readWidth());
	
	System.out.println("Height " + r.readHeight());
	System.out.println("Area is " + (r.readHeight()*r.readWidth()));
}

}
