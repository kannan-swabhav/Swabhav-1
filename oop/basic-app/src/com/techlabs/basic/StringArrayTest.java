package com.techlabs.basic;

public class StringArrayTest {
	
	public static void main(String[] args) {
		String[] nameArray= {"tejashree","pawan","sejal","tanmay","murtaza","jay","vinit","prasad","pawan"};
		int i, length=0;
		String maxLengthName=null;
		
		for(i=0;i<nameArray.length;i++) 
		{
			System.out.println(nameArray[i]);
		}
		
		for(String name:nameArray)
		{
			System.out.println(name);
		}
		
		for(String name:nameArray)
		{
			if(name.contains("a"))
				System.out.println(name);
		}
		
		for(i=0;i<nameArray.length;i++)
		{
			if(nameArray[i].length()>length)
			{
				length=nameArray[i].length();
				maxLengthName=nameArray[i];
			}
			
		}
		System.out.print(maxLengthName);
	}

}
