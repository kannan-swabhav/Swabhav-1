package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private GenderType gender;
	private float height;
	private float weight;

	public Person(String pname, int page, GenderType pgender, float pheight, float pweight) {
		name = checkName(pname);
		age = checkAge(page);
		height= checkHeight(pheight);
		weight=checkWeight(pweight);
		setGender(pgender);

	}

	private String checkName(String pname) {
		if (pname == null) {
			pname="unknown";
		}
		return pname;
	}

	private int checkAge(int page) {
		if (page < 0) {
			page = 1;
		}
		return page;
	}
	
	private float checkHeight(float pheight) {
		if (pheight < 0) {
			pheight = 1;
		}
		return pheight;
	}
	
	private float checkWeight(float pweight) {
		if (pweight < 0) {
			pweight = 1;
		}
		return pweight;
	}
	
	public void doWorkout() {
		weight= weight-(0.02f *weight);
	}
	
	public void doFat() {
		weight=weight+ (0.05f *weight);
	}
	
	public float getWeight() {
		return weight;
	}
	
	public float getHeight() {
		return height;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public GenderType getGender() {
		return gender;
	}
	
	public void setGender(GenderType pgender) {
		gender=pgender;
	}
}
