package com.oops;

public class Student {

	int id;
	String name;
	String grade;

	// initialization of object using method
	public void insert(int sid, String sname, String sgrade) {

		id = sid;
		name = sname;
		grade = sgrade;
	}

	public void show() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
	}
}
