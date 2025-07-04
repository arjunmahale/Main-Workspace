package thread_concept.interthread_comm;

public class TotalBalance extends Thread {

	int balance;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i=0;i<5;i++)
			{
				balance=i*100;
			}
			notify();
		}

	}
}
