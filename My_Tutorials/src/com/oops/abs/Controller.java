package com.oops.abs;

public class Controller extends Abstaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Abstaction c1=new Controller();
			c1.sound();
			c1.show();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("sound from child class.");
	}

}
