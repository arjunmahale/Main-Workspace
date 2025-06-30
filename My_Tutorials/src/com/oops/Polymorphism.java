package com.oops;

class RBI{
	public int getrateofinterest() {
		return 1;
	}
}


class SBI extends RBI{
	public int getrateofinterest() {
		return 3;
	}
}


class BOB extends RBI{
	public int getrateofinterest() {
		return 2;
	}
}


class mah extends RBI{
	
}


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method overloading ->compile time polymorphism
		//method overriding ->run time polymorphism
		
		
		RBI sbi,bob,mah;
		mah=new RBI();
		sbi=new SBI();
		bob=new BOB();
		System.out.println(mah.getrateofinterest());
		System.out.println(sbi.getrateofinterest());
		System.out.println(bob.getrateofinterest());

	}

}
