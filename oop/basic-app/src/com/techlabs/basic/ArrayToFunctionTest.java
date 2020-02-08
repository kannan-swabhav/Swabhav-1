package com.techlabs.basic;

public class ArrayToFunctionTest {
	public static void main(String[] args) {
		double[] cgpaList= {7.5, 6.5, 6.7,8.5,5.5};
		
		upgradeCgpa(cgpaList);
		for(double cgpa:cgpaList) {
			System.out.println(cgpa);
		}
			
		}
	public static void upgradeCgpa(double cgpaList[]) {
		
		for(int i=0;i<5;i++) {
			cgpaList[i] = cgpaList[i]+cgpaList[i]*0.1;
		}
	}

}
