package com.oops;

class Calculation{

	public int square(int num)
	{
		return num*num;
	}
}

class Cube{
	
	Calculation cal;
	public void Printcube(int num)
	{
		cal=new Calculation();
		int result =num*(num);
		System.out.println("Cube is : "+result);
	}
}
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cube c1=new Cube();
	c1.Printcube(5);
		
	}

}
