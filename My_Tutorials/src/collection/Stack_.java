package collection;

import java.util.Stack;

public class Stack_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack<Integer> s1=new Stack<>();
  s1.push(34);
  s1.push(23);
  System.out.println(s1.peek());
  s1.pop();
  for(int i:s1) {
	  System.out.println(i);
  }
	}

}
