package filehandelinganddate;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter file2 = new FileWriter("src/filehandelinganddate/demo6.txt", true);
		file2.write("\ndata written on file using filewriter");
		System.out.println("data write successfully");
		file2.close();
	}

}
