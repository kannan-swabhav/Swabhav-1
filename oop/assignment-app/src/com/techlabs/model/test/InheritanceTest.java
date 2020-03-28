package com.techlabs.model.test;

import com.techlabs.model.InheritanceClass2;

public class InheritanceTest {
	public static void main(String[] args) {

	      InheritanceClass2 p1 = new InheritanceClass2();
	      p1.eat();
	      p1.fly();
	      p1.mimicVoice();
	      p1.displayInfo(p1.getColour(), p1.getType()); 
	   }

}
