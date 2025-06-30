package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Inputs_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your full name : \n");
//		String name=sc.nextLine();
//		System.out.println("hello "+name);
		
	
		//file path should be from the src folder like src/
		//or as C:\Users\HP\eclipse-workspace\Main-Workspace\My_Tutorials\src\exceptions\Inputs_in_java.java ->> absolute path on the disk
		
			try {
				FileReader fr=new FileReader("C:\\Users\\HP\\eclipse-workspace\\Main-Workspace\\My_Tutorials\\src\\exceptions\\Demo.java");
				BufferedReader br=new BufferedReader(fr);
				
				String line;
				while((line=br.readLine())!=null)
				{
					if(line.contains("claees"))
					{
						System.out.println(" word found ..");
					}
					
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}

