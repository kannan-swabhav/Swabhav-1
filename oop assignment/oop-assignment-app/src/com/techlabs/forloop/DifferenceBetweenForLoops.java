package com.techlabs.forloop;

public class DifferenceBetweenForLoops {
	
	public static void main(String[] args)
	{
	String[] nameArray= {"tejashree","pawan","sejal","tanmay","murtaza","jay","vinit","prasad","pawan"};
	int i;
	
	System.out.println("Enhanced for loop");
	for(String name:nameArray)
		System.out.println(name);
	
	System.out.println("Tradition for loop (to print array elements in ascending order)");
	for(i=0;i<nameArray.length;i++)
	{
		System.out.println(nameArray[i]);
	}
	
	System.out.println("Traditional for loop (to print first ten natural numbers)");
	for(i=1;i<11;i++)
		System.out.println(i);
	
	System.out.println("conclusion: by using the traditional for loop we have the control over the loop activities and we can use as many as variations according to the requirements but in case of enhanced for loop we could execute it only in one way");
	}
}
