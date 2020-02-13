package com.techlabs.boxingconcepts;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingTest {
	
	public static void main(String [] args) {
		
		List<Integer> li = new ArrayList<>();
		for (int i=1; i < 11; i++)
		    li.add(i);
         
		for (int i=0; i< li.size();i++) {
			System.out.println(li.get(i));
		}
	}

}
