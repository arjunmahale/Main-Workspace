package exceptions;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//primitive data type-class object
		//int-Integer
		//short-Short
		//float-Float
		//double-Double
		//char-Character
		//boolean-Boolean
		
		//autoboxing -primitive to object
		
		
		int num=23;
		Integer i=num;
		Integer n=Integer.valueOf(num);
		
		boolean num1=true;
		Boolean n1=Boolean.valueOf(num1);
		
		String name="1231";
		
		Integer n2=Integer.parseInt(name);
		System.out.println(n2);
		
		
		
		//unboxing-object to primitive
		
		Integer num3=234234;
		int num4=num3.intValue();
	}

}
