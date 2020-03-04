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
		System.out.println("BIggest circle is " + big);
		Circle small = findSmallCircle(circles);
		System.out.println("Smallest circle is " + small);
		System.out.println("Max radius is" + findBigCircle(circles).getRadius());
		printInfo(findSmallCircle(circles));

	}

	public static Circle findBigCircle(Circle[] circles) {

		Circle big = null;
		float radius = circles[0].getRadius();
		for (int i = 0; i < 5; i++) {
			if (circles[i].getRadius() > radius)
				big = circles[i];
		}
		return big;
	}

	public static Circle findSmallCircle(Circle[] circles) {

		Circle small = null;
		float radius = circles[0].getRadius();
		for (int i = 0; i < 5; i++) {
			if (circles[i].getRadius() < radius)
				small = circles[i];
		}
		return small;
	}

	public static void printInfo(Circle[] circles) {
		for (Circle c : circles) {
			printInfo(c);
		}
	}

	public static void printInfo(Circle c) {
		System.out.println("Radius is " + c.getRadius());
		System.out.println("Area of circle is " + c.calculateArea(c.getRadius()));
		System.out.println("Perimeter is " + c.calculatePerimeter(c.getRadius()));
	}
}
