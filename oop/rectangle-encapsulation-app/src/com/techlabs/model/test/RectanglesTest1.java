package com.techlabs.model.test;

import com.techlabs.model.Rectangle1;

public class RectanglesTest1 {
	public static void main() {
		
		Rectangle1 rect= new Rectangle1();
		rect.rectangle(10, 30, "blue");
		

		System.out.println("width" + rect.getWidth());
		
		System.out.println("height" + rect.getHeight());
		System.out.println("width" + rect.getColour());
		
		System.out.println("Area is : "+rect.calculateArea());
	}

}
