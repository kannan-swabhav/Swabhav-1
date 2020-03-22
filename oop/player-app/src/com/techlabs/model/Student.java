package com.techlabs.model;

public class Student {
	private String name;
	private int age;
	private int id;

	public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age = age;
		System.out.println("player created");
	}

	public Student(int id, String name) {
		this(id, name, 18);
	}
	
	public Student whoIsElder(Student second) {
		if(this.age< second.age) {
			return second;
		}
			return this;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

}
