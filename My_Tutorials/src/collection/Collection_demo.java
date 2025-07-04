package collection;

import java.util.ArrayList;
import java.util.Iterator;

//collection-group of objects 
//Iterable(interface)->Collection(interface)->1]list(interface) ->Arraylist,linkedlist, vector,stack
						//2]queue(interface)->priority queue,deque(interface)->array,deque
						//3]Set(interface)->hashset,linkedhashset,sorted set(interface)->1]treeset

//else are classes
public class Collection_demo {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(23);
		list.add(45);
		list.add(96);
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(75);
		list1.add(55);
		list1.add(85);
		list.addAll(list1);
		System.out.println("Array list is : "+list);
		
		System.out.println("Traversing using Iterator interface");
		
		Iterator<Integer> itr=list.iterator();
		
		while (itr.hasNext()) {
			System.out.print(" " +itr.next());	
						
		}
		
		
		
		System.out.println(list.contains(45));
		System.out.println(list.indexOf(45));
		
		
		//replaces the old object
		list.set(0, 67);
		
		for(int i: list)
		{
			System.out.println(i);
		}
		System.out.println(list.get(0));
	}
	
}
