package com.techlabs.basic;

public class OverloadingTest {
	public static void main(String[] args) {
	
		System.out.print(1.3);
		System.out.print(34);
		
		printInfo(false);
		printInfo("hello");
		printInfo(0.1f);
		printInfo(1);
		printInfo('h');
		
	
	}

	private static void printInfo(String s) {
		System.out.println(s);
	}

	private static void printInfo(int i) {
		System.out.println(i);
	}

	private static void printInfo(char c) {
		System.out.println(c);
	}

	private static void printInfo(float f) {
		System.out.println(f);
	}

	private static void printInfo(boolean b) {
		System.out.println();
	}
}
