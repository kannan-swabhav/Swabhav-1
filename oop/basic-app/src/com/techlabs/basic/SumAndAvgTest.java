package com.techlabs.basic;

public class SumAndAvgTest {
	public static void main(String[] numbers) {
		
		if(numbers.length==0) {
			System.out.println("No arguments are passed");
			return;
		}
		
		int length=(numbers.length-1),count=length ; 
		
		for(int i=0;i<numbers.length ;i++) {
			System.out.print(numbers[i] +" ");
		}
		
		if(numbers[length].equals("even")) {
		
			for(int i=0;i<length;i++) {
				int a=Integer.parseInt(numbers[i]);
				if(a%2==1) {
					numbers[i]="0";
					count--;
				}
				
			}
		}
		
		else {
			for(int i=0;i<(numbers.length-1);i++) {
				int a=Integer.parseInt(numbers[i]);
				if(a%2==0) {
					numbers[i]="0";
					count--;
				}
			
		}
		
		sumOfNumbers(numbers);
		avgOfNumbers(numbers , count);
		}
	}
	
	private static String[] remove(String[] numbers, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void sumOfNumbers(String numbers[]) {
		int sum=0;
		int[] numbersCopy;
		for(int i=0;i<(numbers.length-1);i++){
			int a=Integer.parseInt(numbers[i]);
			sum=sum+a;
		}
		System.out.println("\nSum of the numbers is "+ sum);
	}
	
	public static void avgOfNumbers(String numbers[], int count) {
		int sum=0;
		for(int i=0;i<(numbers.length-1);i++){
			int a=Integer.parseInt(numbers[i]);
			sum=sum+a;
		}
		int avg=sum/count;
		System.out.println("Average of the numbers is "+ avg);
	}
}
