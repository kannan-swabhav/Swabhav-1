package com.techlabs.passbyvalue;

public class PassByValue 
	{
	 int data=50; 
	     
	 public static void main(String args[]){  
	   PassByValue op=new PassByValue();  
	  
	   System.out.println("before change "+op.data);  
	   op.doesNotChangesValue(500);
	   //op.changesValue(op);
	   System.out.println("after change "+op.data); 
	 }
	 
	 public static void changesValue(PassByValue op)
	 {  
		 op.data=op.data+100;//changes will be in the instance variable only  
	 }  
	 
	 public static void doesNotChangesValue(int data)
	 {
		 data=data+100;//changes will be in the local variable only  
	 }
	}