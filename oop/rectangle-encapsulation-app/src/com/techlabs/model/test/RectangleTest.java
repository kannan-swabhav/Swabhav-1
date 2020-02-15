package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		
		Rectangle violatesEncapsulation=new Rectangle();
		violatesEncapsulation.changeWidth(1000);
		violatesEncapsulation.changeHeight(-20);
		System.out.println("width of rectangle is "+ violatesEncapsulation.readWidth());
		System.out.println("height of rectangle is "+ violatesEncapsulation.readHeight());
		
		Rectangle normalCase =new Rectangle();
		normalCase.changeWidth(10);
		normalCase.changeHeight(5);
		System.out.println("width of rectangle is "+ normalCase.readWidth());
		System.out.println("height of rectangle is "+ normalCase.readHeight());
	}

}
