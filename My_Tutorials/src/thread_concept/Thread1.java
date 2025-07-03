package thread_concept;

public class Thread1 extends Thread {
	Synchronization_method t;

	public Thread1(Synchronization_method t) {
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.table(1);
	}

}
