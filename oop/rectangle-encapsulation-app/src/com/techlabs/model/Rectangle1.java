package com.techlabs.model;

public class Rectangle1 {
	private int width;
	private int height;
	
	private String colour;
	
	public void rectangle(int pwidth, int pheight, String pcolour) {
		width=pwidth;
		
		height= pheight;
		colour=pcolour;
	}
	
	public void rectanngle(int pwidth, int pheight) {
		width=pwidth;
		
		height= pheight;
		colour="RED";
		
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int calculateArea() {
		return (width*height);
	}
}
