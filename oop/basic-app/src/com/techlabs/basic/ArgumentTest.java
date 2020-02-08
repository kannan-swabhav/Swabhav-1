package com.techlabs.basic;

public class ArgumentTest {
	
	public static void main(String[] names)
	{
		int i, length =names.length;
		
		for(String name:names) {
		System.out.println(name.concat("aurionpro"));
		}
		
		System.out.println(names);
		System.out.println(names[0]);
		for(i=0;i<names.length;i++) {
			names[i]=names[i].concat("aurionpro");
			System.out.println(names[i]);
		}
		
		System.out.println("before " + names[0]);
		
		String[] namescopy=names;
		for(i=0;i<namescopy.length;i++) {
			namescopy[i]=namescopy[i].concat("aurionpro");
			System.out.println(namescopy[i]);
		}
		
		System.out.println(namescopy[0]);
		System.out.println("after " + names[0]);
		System.out.println(namescopy);
		System.out.println(names);
		namescopy[2]="swabhavtechlabs";
		System.out.println(names[2]);
	}
}
