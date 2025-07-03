package thread_concept;
//

//join method -it stops other threads execution while it completes it. exe.  t1.join();
public class Join_method extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Join_method t1 = new Join_method();
		t1.setPriority(1);
		Join_method t2 = new Join_method();
		t2.setPriority(5);
		Join_method t3 = new Join_method();
		t3.setPriority(10);
		t1.start();
		
		t2.start();
		 
		t3.start();
		
		
	}

}
