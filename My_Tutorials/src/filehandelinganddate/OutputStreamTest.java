package filehandelinganddate;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//stream-flow of data
//InputStream and outputstream are abstract classes
//InputStream-to read data from file->contains fileinputstream(child class)-> we can make objects of these child classes
//outputstream-to write data on file-> contains fileoutputstream(child class)
//
//✅ Summary of Options
//Method	        Class Used	            Append Support	             Suitable For
//FileOutputStream	Low-level I/O	        ✅ with 2nd arg	        Binary/text data
//FileWriter	    Character-based     	✅ with 2nd arg	        Simple text writing
//BufferedWriter	Buffered writing	    ✅ via FileWriter	    Fast, efficient
//Files.write()	    java.nio.file.*	        ✅ with APPEND	        Modern Java I/O

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"enter option no. :\n1.using file outputStream \n2.using filewriter \n3.using bufferedwriter ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				outputStreammethod();

				break;
			}

			case 2: {

				filewritermethod();
				break;
			}
			case 3: {

				bufferedwritermethod();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		}
	}

	public static void outputStreammethod() throws IOException {
		try {
			FileOutputStream file = new FileOutputStream("src/filehandelinganddate/demo.txt", true);

			// to write the string data we need to convert the required data in byte using
			// getByte() method
			String name = "\nArjun Mahale";
			byte[] data = name.getBytes();
			file.write(data);// internally works on byte data 55converts in 7
			// after running the code it removes the old file content and write new
			// to append the new data into file use true as the second argument in the new
			// FileOutputStream("src/filehandelinganddate/demo.txt",true);
			System.out.println("content write successfully");
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void filewritermethod() throws IOException {
		System.out.println("\nusing filewriter");

		try (FileWriter f1 = new FileWriter("src/filehandelinganddate/demo2.txt", true)) {
			f1.write("\ndirectly writing data in file without converting in byte stream");
		}
		System.out.println("data write successful using filewrite");
	}
	
	public static void bufferedwritermethod() throws IOException {
		System.out.println("\nusing buffered writer");

		try (BufferedWriter f2 = new BufferedWriter(new FileWriter("src/filehandelinganddate/demo2.txt", true))) {
			f2.write("\ndirectly writing data in file without converting in byte stream");
		}
		System.out.println("data write successful using filewrite");
	}
}
