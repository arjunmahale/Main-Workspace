package com.oops.abs;

public class Test_Interface  implements Interfaceclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceclass itr1=new Test_Interface();
		itr1.cal(34, 21);
	}

	@Override
	public void cal(int n, int m) {
		// TODO Auto-generated method stub
		System.out.println("multiplication of "+n+" and "+m+" : "+m*n);
	}

}
