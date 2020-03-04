package com.techlabs.model;

public class Rectangle {
	private int width = 1;
	private int height = 1;
	private ColourType colour;

	public Rectangle(int pwidth, int pheight, ColourType pcolour) {

		width = checkWidth(pwidth);
		height = checkHeight(pheight);
		setColour(pcolour);
	}

	public Rectangle(int pwidth, int pheight) {

		width = checkWidth(pwidth);
		height = checkHeight(pheight);
		colour=ColourType.RED;

	}

	private int checkWidth(int pwidth) {
		if (pwidth < 0) {
			pwidth = 1;
		}
		return pwidth;
	}

	private int checkHeight(int pheight) {
		if (pheight < 0) {
			pheight = 1;
		}
		return pheight;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ColourType getColour() {
		return colour;
	}
	
	public void setColour(ColourType pcolour) {
		colour=pcolour;
	}

	public int calculateArea() {
		return (width * height);
	}

}
