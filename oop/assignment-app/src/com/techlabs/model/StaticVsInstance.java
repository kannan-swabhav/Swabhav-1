package com.techlabs.model;

public class StaticVsInstance {
	private static int staticValue;
	private int instanceValue;

	static {
		staticValue = 10;
		System.out.println("inside static block");
	}
	
	public static int getStaticValue() {
		return staticValue;
	}
	
	public int getInstanceValue() {
		return instanceValue;
	}

}
