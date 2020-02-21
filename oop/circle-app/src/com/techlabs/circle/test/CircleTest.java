package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle r1 = new Circle();
		Circle r2 = new Circle();

		Circle r3 = new Circle();
		Circle r4 = new Circle();

		Circle r5 = new Circle();
		Circle[] circles = { r1, r2, r3, r4, r5 };

		r1.setRadius(5f);
		r2.setRadius(10f);
		r3.setRadius(2.5f);
		r4.setRadius(3.5f);
		r5.setRadius(6.5f);

		printInfo(circles);
		Circle big = findBigCircle(circles);
		System.out.println("BIggest circle is having radius = " + big);
		Circle small = findSmallCircle(circles);
		System.out.println("Smallest circle is " + small);

	}

	public static Circle findBigCircle(Circle[] ref) {

		Circle big = null;
		float radius = ref[0].getRadius();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i].getRadius() > radius)
				big = ref[i];
		}
		return big;
	}

	public static Circle findSmallCircle(Circle[] ref) {

		Circle small = null;
		float radius = ref[0].getRadius();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i].getRadius() < radius)
				small = ref[i];
		}
		return small;
	}

	public static void printInfo(Circle[] ref) {
		for (Circle c : ref) {
			printInfo(c);
		}
	}

	public static void printInfo(Circle c) {
		System.out.println("Radius is " + c.getRadius());
		System.out.println("Area of circle is " + c.calculateArea(c.getRadius()));
		System.out.println("Perimeter is " + c.calculatePerimeter(c.getRadius()));
	}
}
