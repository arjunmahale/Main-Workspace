package Tuts;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Addition {

	static int array_add[][]=new int[2][2];
	static int[][] a=new int[2][2];
	static int[][] b=new int[2][2];
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);

		System.out.println("enter elements for 1st  2x2 array :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
					a[i][j]=sc.nextInt();

			}
		}

		System.out.println("enter elements for 2nd  2x2 array :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();

			}
		}

		System.out.println(Arrays.deepToString(array_add));
		//to print the 1D Array -> Arrays.toString(Array_name);
		//to print the MD Array -> Arrays.deepToString(Array_name);




			add(a,b);
			System.out.println("the resultant matrix is :");
			for(int i=0;i<2;i++)
			{
				System.out.println("");
				for(int j=0;j<2;j++)
				{
				  System.out.print(array_add[i]+" ");

				}
			}


	}

	public static void add(int[][] b,int[][] a) {
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
					int c=b[i][j]+a[i][j];

					array_add[i][j] = c;
			}
		}
	}


}

