package Package1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
		
		
	}

}
