package filehandelinganddate;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocaldateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.atStartOfDay());
		System.out.println(date.getDayOfYear());
		System.out.println(date);
		System.out.println(date);
		System.out.println(date);
		System.out.println("----------------------------\nusing localtime");
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		System.out.println(time);
	}

}
