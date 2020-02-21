package com.techlabs.circle;

public class Circle {
	private float radius;
	private final float PI = 3.14f;

	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float newRadius) {
		radius=newRadius;
	}
	
	public float calculateArea(float radius) {
		float area = PI*radius*radius;
		return area;
	}
	
	public float calculatePerimeter(float radius) {
		float perimeter=2*PI*radius;
		return perimeter;
	}

}
