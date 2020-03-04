package com.techlabs.model.test;

import com.techlabs.model.Person;

public class PersonBmiTest {
	public static void main(String[] args) {
		Person p1 = new Person(69, 1.54);
		printInfo(p1);

		Person p2 = new Person(69, -1.54);
		printInfo(p2);

		Person p3 = new Person(45, 1.63);
		printInfo(p3);

		Person p4 = new Person(0, 0);
		printInfo(p4);

	}

	public static void printInfo(Person p) {
		System.out.println("WEIGHT : " + p.getWeight());
		System.out.println("HEIGHT : " + p.getHeight());
		System.out.println("BMI : " + p.getBmi());
		p.displayBmiStatus();
		System.out.println("\n");
	}

}
