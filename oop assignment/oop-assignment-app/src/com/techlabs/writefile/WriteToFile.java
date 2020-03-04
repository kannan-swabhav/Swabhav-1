package com.techlabs.writefile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		try {
			File f =new File("E:\\Swabhav\\Swabhavrepo\\oop assignment\\oop-assignment-app\\src\\Hello.txt");
			
			for (int i = 0; i < 10; i++) {
				write("Welcome ", f);
			}
		} catch (IOException e) {
		}
	}
	
	public static void write(String s, File f) throws IOException {
		FileWriter fw= new FileWriter(f);
		fw.append("Welcome");
		fw.close();
	}
	String filePath = System.getProperty("com.techlabs.writefile") + "\\src\\Hello.txt";

	String appendText = "Welcome";

}