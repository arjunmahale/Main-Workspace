package com.bean;

public class Student {

	private String sname;
	private String smobile;
	private String sclass;
	private String semail;
	private String simage;


	public Student() {
		super();
	}

	public Student(String sname, String smobile, String sclass, String semail, String simage) {
		super();
		this.sname = sname;
		this.smobile = smobile;
		this.sclass = sclass;
		this.semail = semail;
		this.simage = simage;
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

	public String getSimage() {
		return simage;
	}

	public void setSimage(String simage) {
		this.simage = simage;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", smobile=" + smobile + ", sclass=" + sclass + ", semail=" + semail
				+ ", simage=" + simage + "]";
	}



}
