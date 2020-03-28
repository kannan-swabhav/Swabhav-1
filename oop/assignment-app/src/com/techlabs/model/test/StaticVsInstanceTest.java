package com.techlabs.model.test;

import com.techlabs.model.StaticVsInstance;

public class StaticVsInstanceTest {
	public static void main(String[] args) {
		System.out.println(StaticVsInstance.getStaticValue());
		StaticVsInstance s1 = new StaticVsInstance();
		System.out.println(s1.getInstanceValue());
	}

}
