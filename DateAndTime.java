/*
Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
*/
//
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());  // outputs time in milliseconds	


	}
}
