package com.techlabs.model;

public class Person {
	private double weight = 0;
	private double height = 0;
	private double bmi = 0;
	private double avgBmi=19;
	private double neutralNo=0;

	public Person(double pweight, double pheight) {
		weight = checkWeight(pweight);
		height = checkHeight(pheight);
		calculateBmi(pweight, pheight);
	}

	public void calculateBmi(double pweight, double pheight) {
		bmi = pweight / (pheight * pheight);
	}
	
	public double checkWeight(double pweight) {
		if(pweight<neutralNo)
			pweight=neutralNo;
		return pweight;
	}
	
	public double checkHeight(double pheight) {
		if(pheight<neutralNo)
			pheight=neutralNo;
		return pheight;
	}


	public void displayBmiStatus() {
		if (bmi < avgBmi) {
			System.out.println("Person is under weight");
		} else {
			System.out.println("Person is over weight");
		}
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getBmi() {
		return bmi;
	}

}
