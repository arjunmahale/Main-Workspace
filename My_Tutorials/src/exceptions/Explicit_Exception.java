package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Explicit_Exception {

	/**
	 * 
	 * 1. Checked Exceptions These are exceptions that the compiler checks at
	 * compile time. You are forced to handle them using try-catch or declare them
	 * using throws.
	 * 
	 * 📌 Examples: IOException
	 * 
	 * SQLException
	 * 
	 * FileNotFoundException
	 * 
	 * 
	 * 
	 * 2. Unchecked Exceptions These are not checked at compile time. They occur due
	 * to programming errors and are subclasses of RuntimeException.
	 * 
	 * 📌 Examples: NullPointerException
	 * 
	 * ArithmeticException
	 * 
	 * ArrayIndexOutOfBoundsException
	 * 
	 * NumberFormatException
	 * 
	 * @param age
	 * @throws IOException
	 * 
	 * 
	 * 
	 * throws used for exception declaration and throw used to throw exception
	 */

	public static void voter(int age) throws Exception {
		if (age < 18) {
			throw new CustomException("you are not eligible for voting");
		} else {
			System.out.println("you are eligible for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try catch finally used to handle exception
		// throw used to throw the exception
		System.out.println("first line of the code");
		int age = 12;
		try {
			voter(age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("outer code executed.");
	
	}

}
