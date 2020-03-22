package com.techlabs.model.test;

import com.techlabs.model.Student;

public class PlayerTest {
	public static void main(String[] args) {
		Student sachin = new Student(101, "Sachin", 10);
		Student virat = new Student(102, "virat");
		
		printInfo(sachin);
		printInfo(virat);
		
		Student temp = sachin.whoIsElder(virat);
		System.out.println("Elder player is " + temp.getName());
		System.out.println("displaying temp hashcode" + temp.hashCode());
		System.out.println("displaying sachin hashcode" + sachin.hashCode());
		System.out.println("displaying virat hashcode" + virat.hashCode());
	}

	public static void printInfo(Student p) {
		System.out.println("NAME = " + p.getName());
		System.out.println("Age = " + p.getAge());
		System.out.println("ID = " + p.getId());
	}

}
