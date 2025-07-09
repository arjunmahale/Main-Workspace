package collection;

import java.util.HashSet;
import java.util.Set;

public class Sets_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> h1 = new HashSet<>();
		h1.add(76);
		h1.add(1);
h1.add(null);
		System.out.println(h1);
		for (int i : h1) {
			System.out.println(i);
		}
	}

}
