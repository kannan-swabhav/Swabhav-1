package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	
	public void changeWidth(int pWidth) {
		if (pWidth<0)
			width=1;
		else if(pWidth>100)
			width=100;
		else 
			width=pWidth;
	}
	
	public void changeHeight(int pHeight) {
		if (pHeight<0)
			height=1;
		else if(pHeight>100)
			height=100;
		else 
			height=pHeight;
	}
	
	public int readWidth() {
		return width;
	}
	
	public int readHeight() {
		return height;
	}

}
