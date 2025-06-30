package Tuts;

import java.util.ArrayList;
import java.util.Scanner;

public class Even_odd {
static ArrayList<Integer> arr= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter number of values");
			int n=sc.nextInt();

			for(int i=1;i<=n;i++) {
				System.out.println("============================\nEnter number : \n");

				int num=sc.nextInt();

				arr.add(num);

				pr(num);

			}
		}
	}

	public static void pr(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
	}

}
