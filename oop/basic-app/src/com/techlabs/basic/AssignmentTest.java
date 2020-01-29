package com.techlabs.basic;

public class AssignmentTest {
	
	public static void main(String[] args) {
		String str = "https://www.swabhavtechlabs.com?developer=tejashree&role=engineer.com";
		
		String companyName, employeeName, role;
		int i, dot1=0, dot2=0, dot3=0, equals1=0, equals2=0, and=0;
		
		for(i=0;i<str.length();i++) 
		{
			if(str.charAt(i)=='.') 
			{
				dot1=dot2;
				dot2=dot3;
				dot3=i;
			}
			if(str.charAt(i)=='=') 
			{
				equals1=equals2;
				equals2=i;
			}
			if(str.charAt(i)=='&') 
			{
			and=i;	
			}
		}
		
		companyName=str.substring(dot1+1, dot2);
		employeeName=str.substring(equals1+1, and);
		role=str.substring(equals2+1, dot3);
		
		
		System.out.println("The company name is :" + companyName);
		System.out.println("The employee name is :" + employeeName);
		System.out.println("The role is :" + role);
	}

}
