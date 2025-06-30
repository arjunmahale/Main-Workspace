package com.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("Arjun");
		al.add("Vaibhav");
		al.add("Om");
		al.add("Omkar");
		al.add("Jay");
		TreeSet<String> ts = new TreeSet<String>(al);

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(" " + itr.next());

		}
	}

}
