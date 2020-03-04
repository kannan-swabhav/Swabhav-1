package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectanglePrintTest {
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		Rectangle r2=new Rectangle();
		r1.changeWidth(5);
		r1.changeHeight(10);
		r2.changeWidth(20);
		r2.changeHeight(30);
		System.out.println("First rectangle data :");
		printInfo(r1);
		System.out.println("Second rectangle data :");
		printInfo(r2);
		
	}
	
	public static void printInfo(Rectangle r) {
		System.out.println("Width " + r.readWidth());
		System.out.println("Height " + r.readHeight());
		System.out.println("Area is " + (r.readHeight()*r.readWidth()));
	}

}
