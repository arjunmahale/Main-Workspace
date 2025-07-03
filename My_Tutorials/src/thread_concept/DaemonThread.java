package thread_concept;
/**
// 
Daemon threads are background threads.

They die automatically when all non-daemon (main/user) threads finish.

So, if your main thread finishes before the daemon thread executes, the JVM shuts down, and the daemon thread is killed without printing anything.


💡 What is a Daemon Thread in Java?
A daemon thread is a background thread that runs in service of user (non-daemon) threads. It's designed to perform supportive or housekeeping tasks, such as:

Garbage collection

Background monitoring

Auto-saving

Logging

Cleanup activities

✅ Key Properties of Daemon Threads:
Property	Description
Background Thread	->Runs in the background
Dies Automatically->	JVM kills all daemon threads when no user threads are alive
Low Priority	->Often lower in priority than user threads
Not Meant for Critical Tasks	->Should not hold important business logic or data processing
**/
public class DaemonThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)

		{
			System.out.println("thread Name : "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		DaemonThread t3=new DaemonThread();
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
