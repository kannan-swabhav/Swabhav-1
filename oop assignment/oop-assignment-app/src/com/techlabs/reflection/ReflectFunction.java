package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectFunction 
 {
  public static void main(String[] args)
  {
	  Object obj=new Object();
	  Class cls = obj.getClass(); 
      System.out.println("The name of class is " + 
                          cls.getName()); 
      Method[] methods=cls.getMethods();
      for (Method method:methods) 
      System.out.println(method.getName());
      
  }
 }
