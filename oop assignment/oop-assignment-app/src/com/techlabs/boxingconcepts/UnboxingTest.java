package com.techlabs.boxingconcepts;

public class UnboxingTest {
	
	public static void main(String[] args) {
		Integer i = new Integer(30);
		int unboxingIntTest=i;
		
		Character ch=new Character('a');
		char unboxingCharTest=ch;
		
		System.out.println(i);
		System.out.println(unboxingIntTest);
		
		System.out.println(ch);
		System.out.println(unboxingCharTest);
	}

}
