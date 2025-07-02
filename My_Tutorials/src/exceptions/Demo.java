package exceptions;

public class Demo {

	public static void main(String[] args) throws ArithmeticException {
		// Exception types 1]checked 2]unchecked 3]errors
		
		//try catch finally throw throws
		//finally blocks execute either there is exception or not
		//arithmetic exception
		try
		{
			int num=2/0;
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		//null pointer exception
		try {
				String name=null;
			System.out.println(name.length());
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}
