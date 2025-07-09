package collection;

import java.util.PriorityQueue;


public class Queue_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> q1=new PriorityQueue<>();
		q1.add(34);
		q1.add(67);
		q1.add(98);

		q1.add(23);
		q1.add(23);
		System.out.println(q1.size() );
		System.out.println(q1.peek());
		for(int i:q1) {
			System.out.println(i);

		}
		int temp=q1.poll();
		System.out.println(temp);
	}

}
