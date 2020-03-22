package com.techlabs.model;

public class Student {
	private String name;
	private double cgpa;
	private int id;
	private static int instanceCount = 0;

	public Student(int id, String name, double cgpa) {
		this.id=id;
		this.name=name;
		this.cgpa = cgpa;
		instanceCount= instanceCount+1;
	}

	public Student(int id, String name) {
		this(id, name, 7.0);
	}
	

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int getId() {
		return id;
	}
	
	public int getStudentCount() {
		return instanceCount;
	}

}

