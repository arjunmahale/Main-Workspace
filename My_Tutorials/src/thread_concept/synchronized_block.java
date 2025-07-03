package thread_concept;


//Only a part of the method is synchronized.
public class synchronized_block {

	public void table(int n) {

	synchronized(this)
	{

		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
			System.out.println(i * n);
		}

	}

}
}

