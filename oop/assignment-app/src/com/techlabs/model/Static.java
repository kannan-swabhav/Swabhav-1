package com.techlabs.model;

public class Static {
	private static int i;
	private int j;

	static {
		i = 10;
		System.out.println("static block 1");
	}

	static {
		i = 20;
	    System.out.println("static block 2");
	}

	public Static() {
		System.out.println("inside constructor");
	}

	public static int getI() {
		return i;
	}

}
