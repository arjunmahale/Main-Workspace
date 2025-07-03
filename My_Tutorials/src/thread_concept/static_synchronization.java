package thread_concept;

//Locks on the class, not on object.

//Used when multiple objects are accessing the same static resource.

// Use static synchronization when working with multiple threads and multiple objects accessing static/shared resources.

public class static_synchronization {

	public synchronized static void table(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<11;i++)
		{
			System.out.println(i*n);
		}

	}

}
