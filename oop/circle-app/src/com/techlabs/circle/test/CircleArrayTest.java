package com.techlabs.circle.test;

import java.lang.reflect.Method;

import com.techlabs.circle.Circle;


public class CircleArrayTest {
	public static void main(String[] args) {
		
		Circle[] circles= new Circle[5];
		System.out.println(circles[0]);
		
		Circle displayMethods = new Circle();
		displayMethods(Circle.class);
		
		System.out.println("\n");
		displayMethods(Integer.class);
		
		System.out.println("\n");
		displayMethods(CircleArrayTest.class);
		
		System.out.println(new Circle().calculateArea(10));
		
	}	
	
	public static void displayMethods(Class displayMethods) {
		
		Method[] methods = displayMethods.getDeclaredMethods();
		System.out.println("The number of methods are : "+ methods.length);
		
		for (int i=0;i<methods.length;i++) {
			System.out.println(methods[i].getName());
		}
	}
}
