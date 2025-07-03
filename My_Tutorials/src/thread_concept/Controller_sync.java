package thread_concept;

public class Controller_sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronization_method demo = new Synchronization_method();
		Thread1 t1 = new Thread1(demo);
		Thread2 t2 = new Thread2(demo);

		t1.start();
		t2.start();
	}

}
