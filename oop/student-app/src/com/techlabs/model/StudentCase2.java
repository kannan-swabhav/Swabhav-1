package com.techlabs.model;

public class StudentCase2 {
	private String name;
	private float cgpa;
	private int id;
	private static int instanceCount;
	
	static {
		instanceCount = 0;
	}

	public StudentCase2(int id, String name, float cgpa) {
		this.id=id;
		this.name=name;
		this.cgpa = cgpa;
		instanceCount= instanceCount+1;
	}

	public StudentCase2(int id, String name) {
		this(id, name, 7.0f);
	}
	

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public int getId() {
		return id;
	}
	
	public int getStudentCount() {
		return instanceCount;
	}

}
