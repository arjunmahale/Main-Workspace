package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//list traversing in both direction
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> slist=new ArrayList<>();
		Student s1=new Student(1, "jay");
		Student s2=new Student(2, "om");
		Student s3=new Student(3, "ajay");

		slist.add(s1);
		slist.add(s2);
		slist.add(s3);

		System.out.println(slist.size());
		for (Student student : slist) {
			System.out.println(student.getId()+" "+student.getName());
		}

		Iterator<Student> itr=slist.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s.getId()+" "+s.getName());
		}

		ListIterator<Student> itr1=slist.listIterator(slist.size());
		while(itr1.hasPrevious())
		{
			Student s11=itr1.previous();
			System.out.println(s11.getId()+" "+s11.getName());
		}


	}

}
