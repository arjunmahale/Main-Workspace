package com.oops;

 class Student1{
	  String name="Arjun";
}
public class Has_A_Relationship {

	Student1 s1; //Has-A Relationship
	void show() {
		System.out.println(s1.name);
	}
	public static void main(String[] args) {
		Has_A_Relationship h1=new Has_A_Relationship();
		h1.show();
	}

}
