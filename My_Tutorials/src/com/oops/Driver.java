package com.oops;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile m1 = new Mobile(123123, "vivo", "white");

		System.out.println(m1.name);
		System.out.println(m1.price);
		System.out.println(m1.color);

		m1.show();

		System.out.println("===================================\n");
		
		// initialization of object using method
		Student s1 = new Student();
		s1.insert(1, "Arjun", "A+");
		s1.show();
		System.out.println("---------------------------------\n");
		Student s2 = new Student();
		s2.insert(2, "Vaibhav", "A");
		s2.show();
		System.out.println("===================================\n");
		
		// initialization of object using contructor
		
		
	}

}
