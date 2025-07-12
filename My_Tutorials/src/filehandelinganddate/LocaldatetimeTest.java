package filehandelinganddate;

import java.time.LocalDateTime;

public class LocaldatetimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
	}

}
