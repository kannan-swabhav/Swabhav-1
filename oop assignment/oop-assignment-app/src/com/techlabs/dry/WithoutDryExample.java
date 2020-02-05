package com.techlabs.dry;

public class WithoutDryExample {
	
 public static void main(String[] args)
	{
	 //String student= "inSports";
	 //String student="inNss";
	 //String student="inNcc";
	 String student="inOther";
	 //String student="none";
	 
	 int totalMarks=450;
	 
	 if(student=="inSports")
		 addSportsQuotaMarks(totalMarks);
	 else if(student=="inNss")
		 addNssQuotaMarks(totalMarks);
	 else if(student=="inNcc")
		 addNccQuotaMarks(totalMarks);
	 else if(student=="inOther")
		 addOtherGraceMarks(totalMarks);
	 else
		 System.out.println("Total marks of all the subjects = " + totalMarks);
	 
 	}
 public static void addSportsQuotaMarks(int totalMarks)
 {
	 int updatedMarks= totalMarks+5;
	 int grace= updatedMarks-totalMarks;
	 System.out.println("Total marks of all the subjects = " + totalMarks);
	 System.out.println("Total marks after adding grace markss = " + updatedMarks);
	 System.out.println("Total grace marks added = " + grace);
 }
 
 public static void addNssQuotaMarks(int totalMarks)
 {
	 int updatedMarks= totalMarks+10;
	 int grace= updatedMarks-totalMarks;
	 System.out.println("Total marks of all the subjects = " + totalMarks);
	 System.out.println("Total marks after adding grace markss = " + updatedMarks);
	 System.out.println("Total grace marks added = " + grace);
 }
 
 public static void addNccQuotaMarks(int totalMarks)
 {
	 int updatedMarks= totalMarks+10;
	 int grace= updatedMarks-totalMarks;
	 System.out.println("Total marks of all the subjects = " + totalMarks);
	 System.out.println("Total marks after adding grace markss = " + updatedMarks);
	 System.out.println("Total grace marks added = " + grace);
 }
 
 public static void addOtherGraceMarks(int totalMarks)
 {
	 int updatedMarks= totalMarks+8;
	 int grace= updatedMarks-totalMarks;
	 System.out.println("Total marks of all the subjects = " + totalMarks);
	 System.out.println("Total marks after adding grace markss = " + updatedMarks);
	 System.out.println("Total grace marks added = " + grace); 
 }
 
}
