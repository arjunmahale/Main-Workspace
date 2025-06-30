package Tuts;

import java.util.Arrays;

public class Array_Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one 1D Array
		System.out.println("================================= \n1D Array");


		int[] arr1= {2,3,4,5,5};


		for(int i=0;i<arr1.length;i++)
		{

			System.out.print(arr1[i]+" ");
		}



		//2D Array

		System.out.println("\n================================= \n2D Array ");

		int[][] arr2=new int[4][4];

		arr2[0][0]=34;
		arr2[1][1]=34;
		arr2[2][2]=34;
		arr2[3][3]=34;




		for(int i=0;i<arr2.length;i++)
		{
			System.out.println();
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}

		}

		
		Practice pr=new Practice("Arjun", 1);
		System.out.println("single row from 3d array");
		System.out.println(Arrays.toString(pr.arr3[0]));
		System.out.println(pr);
		
		
	}

}


class Practice{
	int[][] arr3={{2,2},{2,2}};
	String name;int id;


	public Practice(String name, int id) {
		super();
		
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Practice [  name=" + name + ", id=" + id + "]";
	}
	
	
}
