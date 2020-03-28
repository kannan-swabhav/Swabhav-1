package com.techlabs.model.test;

import com.techlabs.model.Student;
import com.techlabs.model.StudentCase2;
import com.techlabs.model.StudentCase3;

public class StudentTestCase1 {
	public static void main(String[] args) {
		System.out.println("Test Case 1:");
		Student s1 = new Student(101, "abc");
		System.out.println(s1.getStudentCount());
		Student s2 = new Student(101, "xyz");
		System.out.println(s1.getStudentCount());
		Student s3 = new Student(101, "lmno", 8.0f);
		System.out.println(s1.getStudentCount());

		System.out.println("Test Case 2:");
		StudentCase2 c1 = new StudentCase2(101, "abc");
		System.out.println(s1.getStudentCount());
		StudentCase2 c2 = new StudentCase2(101, "xyz");
		System.out.println(s2.getStudentCount());
		StudentCase2 c3 = new StudentCase2(101, "lmno", 8.0f);
		System.out.println(s3.getStudentCount());

		System.out.println("Test Case 3:");
		StudentCase3 obj1 = new StudentCase3(101, "abc");
		StudentCase3 obj2 = new StudentCase3(101, "xyz");
		StudentCase3 obj3 = new StudentCase3(101, "lmno", 8.0f);
	}

}
