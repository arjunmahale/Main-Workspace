package collection;
import java.util.Vector;

public class Vector_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Student> v1=new Vector<>();
		Student s1=new Student(1, "Arjun");
		v1.add(s1);
		Student s2=new Student(2, "omkar");
		v1.add(s2);
		Student s3=new Student(3, "om");
		v1.add(s3);

//		v1.add(45);
//		v1.add(23);
//		Collections.sort(v1);;
//		System.out.println(v1.contains(45));
//		System.out.println(v1.capacity());
//		System.out.println(v1.lastElement());
//		System.out.println(v1.firstElement());
		for(Student i:v1) {
			System.out.println(i);
		}
	}

}
