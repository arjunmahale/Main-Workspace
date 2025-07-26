package com.bean;

public class Stud {

private	String name;
private	String email;
private	String classname;
public Stud(String name, String email, String classname) {
	super();
	this.name = name;
	this.email = email;
	this.classname = classname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}


}
