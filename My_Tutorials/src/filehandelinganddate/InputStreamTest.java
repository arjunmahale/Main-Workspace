package filehandelinganddate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f4=new FileInputStream("src/filehandelinganddate/demo.txt");
		int i;
		while((i=f4.read()) !=-1)
		{
			System.out.print((char)i);
		}
			
			

}
}