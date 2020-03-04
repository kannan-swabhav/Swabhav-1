package com.techlabs.model;

public class RectangleTest {
	
	public static void main(String[] args) {
		
		Rectangle rect= new Rectangle();
		rect.r;
		

		System.out.println("width" + rect.getWidth());
		
		System.out.println("height" + rect.getHeight());
		System.out.println("width" + rect.getColour());
		
		System.out.println("Area is : "+rect.calculateArea());
	}

}
