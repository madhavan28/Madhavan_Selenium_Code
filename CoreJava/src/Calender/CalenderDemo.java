package Calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Calendar cal=Calendar.getInstance();
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss Z EEEE");
			System.out.println(sdf.format(cal.getTime()));
			System.out.println(cal.get(Calendar.DAY_OF_MONTH));
			System.out.println(cal.get(Calendar.DAY_OF_WEEK));
			System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			System.out.println(cal.get(Calendar.DAY_OF_YEAR));
			System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
			System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
			System.out.println(cal.get(Calendar.ZONE_OFFSET));
			
		
		
		

	}

}
