package filehandelinganddate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO Auto-generated method stub
		
		File file=new File("src/filehandelinganddate/csvfile2.csv");
		Scanner sc =new Scanner(file);
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	} 

}
