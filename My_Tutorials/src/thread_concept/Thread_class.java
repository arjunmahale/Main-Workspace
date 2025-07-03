package thread_concept;

//multithreading in java can be done using 2 ways:
//1]Thread class
//2]Runnable Interface->run()

public class Thread_class extends Thread {

	int id;
	String name;

	public Thread_class(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println("Thread_class [id=" + id + ", name=" + name + "]");
		System.out.println(Thread.currentThread().getName());
	}


	public static void main(String[] args) {

		Thread_class t1=new Thread_class(2,"Arjun");
		t1.setName("thread1");
		t1.start();
		

		Thread_class t2=new Thread_class(3,"Vaibhav");
		t2.setName("thread2");
		t2.start();
		//System.out.println(t2.getPriority());


	}
}
