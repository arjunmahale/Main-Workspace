package com.oops;

public class Mobile {

	int price;
	String name;
	String color;



	public Mobile(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}



	public Mobile() {
		super();
	}



	public void show()
	{
		System.out.println("Mobile name is :"+name);
	}
}
