package com.techlabs.model.test;

import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 50, "Male", 6.5f, 100f);
		printInfo(p1);
		
		p1.doWorkout();
		printInfo(p1);
		
		p1.doFat();
		printInfo(p1);
		
		Person p2 = new Person(null, 50, "Male", 6.5f, 100f);
		printInfo(p2);
		
		Person p3 = new Person(null, 50, "Male", 6.5f, 100f);
		printInfo(p3);
		
		Person p4 = new Person("abc", 50, "xyz", 6.5f, 100f);
		printInfo(p4);
		
		Person p5 = new Person("abc", 50, "Male", -6.5f, 100f);
		printInfo(p5);
		
		Person p6 = new Person("abc", 50, "Male", 6.5f, -100f);
		printInfo(p6);
	}

	public static void printInfo(Person p) {

		System.out.println("name : " + p.getName());
		System.out.println("age : " + p.getAge());
		System.out.println("gender : " + p.getGender());
		System.out.println("height : " + p.getHeight());
		System.out.println("weight : " + p.getWeight() + "\n");

	}
}
