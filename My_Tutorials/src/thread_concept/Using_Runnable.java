package thread_concept;

//while using runnable interface we should create the Thread object which was not needed in the case of using Thread class
//step1]create the class object and pass it to the THread object
//then use start method to start the thread
public class Using_Runnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("threading using runnable interface name : "+Thread.currentThread().getName());
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Using_Runnable obj1=new Using_Runnable();
		
		Thread t1=new Thread(obj1);
		t1.start();

		Using_Runnable obj2=new Using_Runnable();
		Thread t2=new Thread(obj1);
		t2.start();
		
	}

}
