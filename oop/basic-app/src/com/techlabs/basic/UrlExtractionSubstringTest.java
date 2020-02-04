package com.techlabs.basic;

public class UrlExtractionSubstringTest {
	
	public static void main(String[] args) {

		String url = "https://www.swabhavtechlabs.com?developer=tejashree&role=engineer";
		int arrs[]=new int[2];
		String companyName, employeeName, role;
		int i,decisionMaker=0, j=0, companyNameInitial=0, companyNameEnd=0, employeeNameInitial=0, roleInitial=0, employeeNameEnd=0;
		
		for(i=0;i<url.length();i++) 
		{
			if(url.charAt(i)=='.') 
			{
				companyNameInitial=companyNameEnd;
				companyNameEnd=i;
			}
			else if(url.charAt(i)=='?')
			{
				decisionMaker=i;
			}
			else if(url.charAt(i)=='=') 
			{
				arrs[j]=i;
				j++;
			}
			else if(url.charAt(i)=='&') 
			{
			employeeNameEnd=i;	
			}
		}
		
		
		
		companyName=url.substring(companyNameInitial+1, companyNameEnd);
		
		
		if(url.substring(decisionMaker+1, arrs[0]).equals("role"))
			employeeName=null;
		else if(employeeNameEnd==0)
			employeeName=url.substring(arrs[0]+1);
		else 
		    employeeName=url.substring(arrs[0]+1, employeeNameEnd);
		
		
		if(arrs[1]==0 && url.substring(decisionMaker+1, arrs[0]).equals("developer")) 
		    role=null;
		else if(arrs[1]==0 && url.subSequence(decisionMaker+1, arrs[0]).equals("role"))
		    role=url.substring(arrs[0]+1);
		else
			role=url.substring(arrs[1]+1);
		
		
		System.out.println("The company name is :" + companyName);
		System.out.println("The employee name is :" + employeeName);
		System.out.println("The role is :" + role);
		
	}

}
