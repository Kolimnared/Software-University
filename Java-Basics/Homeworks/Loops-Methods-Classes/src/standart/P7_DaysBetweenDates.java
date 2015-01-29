package standart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class P7_DaysBetweenDates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.print("Enter birthday: ");
		String inputString = scanner.nextLine();

		try {
		    Date date1 = myFormat.parse(inputString);
		    Date date2 = myFormat.parse(myFormat.format(new Date()));
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("You are " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + " days old!");
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		scanner.close();
	}

}
