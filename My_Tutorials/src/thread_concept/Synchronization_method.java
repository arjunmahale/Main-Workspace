package thread_concept;

/**
 * threads should work in synchronized ways
 * 2 ways to achieve synchronization
 * 1]mutual exclusion:synchronized method->>create synchronized method ,synchronized block->>make block as -synchronized(this){//code here},STATIC synchronized-> when multiple resources and multiple object are there then static synchronization is best
 * 2] interthread communication
 *
 *
 * Threads should work in synchronized ways to avoid inconsistency or data corruption
✅ Two Main Ways to Achieve Synchronization:
1️⃣ Mutual Exclusion (Avoiding simultaneous access to critical sections)
➡ Used when multiple threads access shared resources

✅ Ways to implement mutual exclusion:
a) Synchronized Method

Entire method is locked for one thread at a time.

java
Copy
Edit
public synchronized void method() {
    // critical section
}
b) Synchronized Block

Only a part of the method is synchronized.

Syntax:

java
Copy
Edit
synchronized(this) {
    // critical section
}
c) Static Synchronized Method

Locks on the class, not on object.

Used when multiple objects are accessing the same static resource.

java
Copy
Edit
public static synchronized void staticMethod() {
    // static synchronized logic
}
🔸 Use static synchronization when working with multiple threads and multiple objects accessing static/shared resources.

2️⃣ Inter-thread Communication (Cooperation, not competition)
➡ Used when threads share info and coordinate with each other (e.g., producer-consumer problem)

✅ Uses:

wait()

notify()

notifyAll()

➡ These methods must be called from within synchronized context.

✅ Summary Table:
Type	Purpose	Keyword/Method
Mutual Exclusion	Prevent data inconsistency	synchronized
Inter-thread Communication	Let threads coordinate	wait(), notify()


 *
 *
 * **
 **/

//Entire method is locked for one thread at a time.
public class Synchronization_method {

	public synchronized void table(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<11;i++)
		{
			System.out.println(i*n);
		}

	}

}
