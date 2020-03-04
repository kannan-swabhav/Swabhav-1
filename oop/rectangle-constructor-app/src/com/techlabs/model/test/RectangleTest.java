package com.techlabs.model.test;

import com.techlabs.model.ColourType;
import com.techlabs.model.Rectangle;

public class RectangleTest {
public static void main(String[] args) {
		
		Rectangle r1= new Rectangle(-10,5,ColourType.GREEN);
		printDetails(r1);
		
		Rectangle r2= new Rectangle(-5,-2);
		printDetails(r2);
		
		Rectangle r3= new Rectangle(0,0,ColourType.RED);
		printDetails(r3);
		
		Rectangle r4= new Rectangle(10,2,ColourType.BLUE);
		printDetails(r4);
		
		Rectangle r5= new Rectangle(10,20,null);
		printDetails(r5);
		
	}
	
	public static void printDetails(Rectangle r){
		 
		System.out.println("Case study ");
		System.out.println("width : " + r.getWidth());
		System.out.println("height : " + r.getHeight());
		System.out.println("colour : " + r.getColour());
		System.out.println("Area is : "+r.calculateArea() + "\n");
		
	}

}
