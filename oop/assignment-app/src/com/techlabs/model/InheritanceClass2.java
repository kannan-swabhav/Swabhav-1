package com.techlabs.model;

public class InheritanceClass2 extends InheritanceClass1 {
	public void displayInfo(String c, String type){
	      System.out.println("I am a " + type );
	      System.out.println("My color is " + c);
	   }
	
	public void mimicVoice() {
	      System.out.println("I can mimic your voice");
	   }

}
