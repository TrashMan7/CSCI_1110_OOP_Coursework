import java.util.Date;
public class DateClass {
	public static void main(String[] args) {
		Date date1 = new Date(10000);
		Date date2 = new Date(100000);
		Date date3 = new Date(1000000);
		Date date4 = new Date(10000000);
		Date date5 = new Date(100000000);
		Date date6 = new Date(1000000000);
		Date date7 = new Date(10000000000L);
		Date date8 = new Date(100000000000L);
		System.out.println("The date for date1 is " + date1.toString());
		System.out.println("The date for date2 is " + date2.toString());
		System.out.println("The date for date3 is " + date3.toString());
		System.out.println("The date for date4 is " + date4.toString());
		System.out.println("The date for date5 is " + date5.toString());
		System.out.println("The date for date6 is " + date6.toString());
		System.out.println("The date for date7 is " + date7.toString());
		System.out.println("The date for date8 is " + date8.toString());

	}

}