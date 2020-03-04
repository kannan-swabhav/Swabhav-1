package com.techlabs.model.test;

import com.techlabs.model.GenderType;
import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 50, GenderType.MALE, 6.5f, 100f);
		printInfo(p1);

		p1.doWorkout();
		printInfo(p1);

		p1.doFat();
		printInfo(p1);

		Person p2 = new Person(null, 50, GenderType.MALE, 6.5f, 100f);
		printInfo(p2);

		Person p3 = new Person(null, 50, GenderType.FEMALE, 6.5f, 100f);
		printInfo(p3);

		Person p4 = new Person("abc", 50, GenderType.MALE, -6.5f, 100f);
		printInfo(p4);

		Person p5 = new Person("abc", 50, GenderType.OTHERS, 6.5f, -100f);
		printInfo(p5);
	}

	public static void printInfo(Person p) {

		System.out.println("name : " + p.getName());
		System.out.println("age : " + p.getAge());
		System.out.println("gender : " + p.getGender());
		System.out.println("height : " + p.getHeight());
		System.out.println("weight : " + p.getWeight() + "\n");

	}
}
