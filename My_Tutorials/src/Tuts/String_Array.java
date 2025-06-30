package Tuts;

import java.util.Scanner;

public class String_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"Arjun","om","omkar","jay","ajay"};
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter name to search : \n");
			String name=sc.next();
			Find_name(arr, name);
		}
		
	} 
	
	 public static void Find_name(String[] arr,String name)
		{
		 for(String i:arr)
			{
				if(i.equals(name)) {
					
					System.out.print(" "+i+" name found.");
				}
			
			}
		 System.out.println(name+" name not found");
		}
		 
		

}
