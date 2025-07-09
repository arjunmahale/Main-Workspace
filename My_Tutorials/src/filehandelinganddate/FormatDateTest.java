package filehandelinganddate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat formatter=new SimpleDateFormat("YYYY/MMMM/dd HH:mm:ss");
		String fdate=formatter.format(date);
		System.out.println("after format");
		System.out.println(fdate);
		
	}

}
