package com.bean;

public class Student {

	private String sname;
	private String smobile;
	private String sclass;
	private String semail;
	public Student(String sname, String smobile, String sclass, String semail) {
		super();
		this.sname = sname;
		this.smobile = smobile;
		this.sclass = sclass;
		this.semail = semail;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmobile() {
		return smobile;
	}
	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", smobile=" + smobile + ", sclass=" + sclass + ", semail=" + semail + "]";
	}



}
