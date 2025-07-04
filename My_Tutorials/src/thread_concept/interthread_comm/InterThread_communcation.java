package thread_concept.interthread_comm;
//Object class parent of all classes
//wait- waits for this thread exe completion  and notify-notifies after completing	 the exe of resource methods come from object class
public class InterThread_communcation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalBalance t=new TotalBalance();
		t.start();
		synchronized (t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.balance);
		}
	}

}
