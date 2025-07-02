package thread_concept;


public class Thread_class extends Thread {

	int id;
	String name;

	public Thread_class(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Thread_class [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {

		Thread_class t1=new Thread_class(2,"Arjun");
		System.out.println(t1.getPriority());

		Thread_class t2=new Thread_class(2,"Arjun");
		System.out.println(t2.getPriority());


	}
}
