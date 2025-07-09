package filehandelinganddate;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file =new File("src/filehandelinganddate/demo.txt");

		try (FileReader r = new FileReader(file)) {
			int i;
			while((i=r.read())!=-1)
			{
				char ch=(char)i;
				System.out.print(ch);


			}
		}

	}

}
