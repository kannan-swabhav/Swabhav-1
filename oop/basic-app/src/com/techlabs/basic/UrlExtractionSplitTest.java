package com.techlabs.basic;

import java.util.Arrays;

public class UrlExtractionSplitTest {
	
	public static void main(String[] args) 
	{
		//String url="https://www.swabhavtechlabs.com?developer=tejashree&role=engineer";
		//String url="https://www.swabhavtechlabs.com?role=engineer";
		//String url="https://www.swabhavtechlabs.com?developer=tejashree";
		String url="https://www.aurionpro.com?developer=tejashree&role=engineer";
		//String url=null;
		
		String companyName, employeeName, role;
		int i;
		
		if(url!=null)
	    {
		url = url.replace('=', '.');
		url = url.replace('&', '.');
	    String[] split=url.split("\\.");
	    companyName=split[1];
	    
	    System.out.println(Arrays.toString(split));
	    
	    if(url.contains("developer")==true && url.contains("role")==true)
	    	employeeName=split[3];
	    else if(url.contains("developer")==true)
	    	employeeName= split[3];
	    else
	    	employeeName= null;
	    
	    
	    if(url.contains("role")==true && url.contains("developer")==true)
	        role= split[5];
	    else if(url.contains("role")==true)
	    	role= split[3];
	    else
	    	role= null;
	    
	      
	    System.out.println(companyName);
	    if(employeeName!=null)
	    System.out.println(employeeName);
	    if(role!=null)
	    System.out.println(role);
	    }
	    else
	    {
	    	System.out.println("Values not found");
	    }
	}

}
