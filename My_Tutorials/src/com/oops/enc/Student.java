package com.oops.enc;

//class contaning only var names and getters and setters is called Bean class or pojo class
//A Bean class in Java is simply a POJO (Plain Old Java Object) that follows specific conventions
//encapsulation obtained by using private members in the class
//access modifiers or access specifier default,public ,private,protected
public class Student {
  private int id;
  private String name;
  private String Grade;
  static String dept="CS";
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGrade() {
	return Grade;
}
public void setGrade(String grade) {
	Grade = grade;
}


public static String getDept() {
	return dept;
}
public static void setDept(String dept) {
	Student.dept = dept;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Grade=" + Grade +" dept : "+dept+ "]";
}




}
