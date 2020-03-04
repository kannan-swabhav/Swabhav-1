package com.techlabs.thispointer;

public class ApplicationsOfThisPointerTest {

	public static void main(String[] args) {

		ApplicationsOfThisPointer applicaton1 = new ApplicationsOfThisPointer(10, 20);
		applicaton1.display();
		
		 ApplicationsOfThisPointer application2 = new ApplicationsOfThisPointer();
		 
		 ApplicationsOfThisPointer application3= new ApplicationsOfThisPointer();
		 application3.get().display();
		 
		 ApplicationsOfThisPointer application4= new ApplicationsOfThisPointer();
		 application4.getThis();
		 
		 ApplicationsOfThisPointer application5= new ApplicationsOfThisPointer();
		 application5.displayUsingThis();
	}
}
