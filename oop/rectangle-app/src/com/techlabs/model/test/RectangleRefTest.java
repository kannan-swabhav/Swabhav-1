package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleRefTest {
	public static void main(String[] args) {
		Rectangle small=null ;//small expects an object
		System.out.println(small);
		small=new Rectangle();//small now contains address of an object
		System.out.println(small);
		System.out.printf("width= %d height=%d area=%d \n",small.width,small.height,small.calculateArea());
	
		small.width=1000;
		small.height=-20;
		small.calculateArea();//violates encapsulation (accepts the negative value and also accepts value beyond limit)
		System.out.printf("width= %d height=%d area=%d",small.width,small.height,small.calculateArea());
	}
}
