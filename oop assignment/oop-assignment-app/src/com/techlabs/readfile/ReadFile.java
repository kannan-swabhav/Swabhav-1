package com.techlabs.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
	
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Swabhav\\Swabhavrepo\\hello.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
	}

}
