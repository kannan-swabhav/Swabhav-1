package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleArrayOfObjectTest {
	public static void main(String[] args) {
		Rectangle[] rectangles= new Rectangle[3];
		rectangles[0]=new Rectangle();
		
		Rectangle r1=new Rectangle();
		Rectangle r2= new Rectangle();
		
		r1.changeWidth(5);
		r1.changeHeight(10);
		
		r2.changeWidth(20);
		r2.changeHeight(30);
		
		rectangles[1]=r1;
		rectangles[2]=r2;
		printInfo(rectangles);
		printInfo(rectangles[1]);
	}
	
	public static void printInfoCase1(Rectangle[] ref){
		for(int i=0;i<3;i++) {
			System.out.println(ref[i].hashCode());
			System.out.println("Height is " + ref[i].readHeight());
			System.out.println("Width is " + ref[i].readWidth());
		}
	}
	
	public static void printInfo(Rectangle[] ref) {
		for (Rectangle r:ref) {
			printInfo(r);
		}
		
	}
	
	public static void printInfo(Rectangle r) {
		System.out.println("Width " + r.readWidth());
		System.out.println("Height " + r.readHeight());
	}

}
