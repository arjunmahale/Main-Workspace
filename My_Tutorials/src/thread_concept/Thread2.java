package thread_concept;

public class Thread2 extends Thread {

	Synchronization_method t;

	public Thread2(Synchronization_method t) {
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.table(10);
	}

}
