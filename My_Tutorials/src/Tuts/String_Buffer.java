package Tuts;

import java.util.Arrays;
import java.util.Scanner;

public class String_Buffer {

	public static void main(String[] args) {

			try (Scanner sc = new Scanner(System.in)) {
				while(true)
				{



								System.out.println(
										"select option: \n1.show string demo \n2.show stringbuffer demo \n3.show stringbuilder demo \n4.show array sort example ");
								int ch = sc.nextInt();
								switch (ch) {
								case 1: {

									// String is immutable
									String mname = "aakash";
									System.out.println(mname);
									mname.concat("wer");
									System.out.println(mname);
									System.out.println("----------------------------------------\n");

									break;

								}
								case 2: {

									// StringBuffer is mutable ->uses synchronisation -> ideal for multithreading
									// -slower than stringBuilder is a class
									// StringBuilder is mutable ->not synchronisation ->not ideal for multithreading
									StringBuffer name = new StringBuffer("Arjun");

									name.append(" Mahale");
									System.out.println(name);

									name.insert(5, " k.");
									System.out.println(name);

									name.replace(5, 9, " ");
									System.out.println(name);

									name.reverse();
									System.out.println(name);
									break;
								}
								case 3: {
									// StringBuilder is mutable ->not synchronisation ->not ideal for multithreading
									System.out.println("----------------------------------------\n");
									StringBuilder name1 = new StringBuilder("Arjun");

									name1.append(" Mahale");
									System.out.println(name1);

									name1.insert(5, " k.");
									System.out.println(name1);

									name1.replace(5, 9, " ");
									System.out.println(name1);

									name1.reverse();
									System.out.println(name1);
									break;
								}
								case 4: {

									System.out.println("enter no. of array elements :");
									int n = sc.nextInt();

									int[] arr = new int[n];
									System.out.println("enter " + n + " array elements :");
									for (int i = 0; i < n; i++) {
										arr[i] = sc.nextInt();
									}
									System.out.println("Array before sorting");
									System.out.println(Arrays.toString(arr));
									Array_sort(arr);
									System.out.println("Array after sorting");
									System.out.println(Arrays.toString(arr));

									break;

								}
								default:
									throw new IllegalArgumentException("Unexpected value: " + ch);
								}


				}
			}


	}

	public static void Array_sort(int[] a) {
		Arrays.sort(a);
		System.out.println(a);
	}

}
