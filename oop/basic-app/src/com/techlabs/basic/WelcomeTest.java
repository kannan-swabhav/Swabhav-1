package com.techlabs.basic;

public class WelcomeTest {
	public static void main(String[] args) {
	
		System.out.print(1.3);
		System.out.print(34);
		printinfo(false);
		printinfo("hello");
		printinfo(0.1f);
		printinfo(1);
		printinfo('h');
		
	
	}

	public static void printinfo(String s) {
		System.out.println(s);
	}

	public static void printinfo(int i) {
		System.out.println(i);
	}

	public static void printinfo(char c) {
		System.out.println(c);
	}

	public static void printinfo(float f) {
		System.out.println(f);
	}

	public static void printinfo(boolean b) {
		System.out.println();
	}
}
