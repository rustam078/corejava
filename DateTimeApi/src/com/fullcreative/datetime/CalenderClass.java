package com.fullcreative.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CalenderClass {

	public static void main(String[] args) {

		Calendar instance = Calendar.getInstance();
		System.out.println(instance);
		System.out.println(instance.getTime());
		System.out.println(instance.getTimeZone().getID());
		System.out.println(instance.getCalendarType());
		System.out.println(instance.getTime().getDate());
		System.out.println(instance.getTime().getMonth()+1);
		System.out.println(instance.getTime().getYear()+1900);
		System.out.println(instance.getTime().getHours());
		System.out.println(instance.getTime().getMinutes());
		
		System.out.println("/******************************/");
		

		System.out.println("Hours = "+instance.get(Calendar.HOUR));  //for 12 hour
		System.out.println("hour = "+instance.get(Calendar.HOUR_OF_DAY)); //for 24 hour
		System.out.println("min = "+instance.get(Calendar.MINUTE));
		System.out.println("sec = "+instance.get(Calendar.SECOND));
		
		System.out.println("Today date= "+instance.get(Calendar.DATE));
		System.out.println("Today month= "+instance.get(Calendar.MONTH));
		System.out.println("Today year= "+instance.get(Calendar.YEAR));
		System.out.println("no of day of the year passed = "+instance.get(Calendar.DAY_OF_YEAR));
		System.out.println("no of days in current month = "+instance.get(Calendar.DAY_OF_MONTH));
		System.out.println("/**********************************************/");
		System.out.println("day of week is = "+instance.get(Calendar.DAY_OF_WEEK));
		System.out.println("no of week in current month = "+instance.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("week of the year = "+instance.get(Calendar.WEEK_OF_YEAR));
		System.out.println("week of the month = "+instance.get(Calendar.WEEK_OF_MONTH));
		System.out.println("get First Day Of Week month = "+instance.getFirstDayOfWeek());
		
		System.out.println("/************************************/");
		
		// 1st way to get time of different country
		String pattern="dd-MM-yyyy hh:mm:ss a";
		SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
		System.out.println(" date="+dateformat.format(instance.getTime()));
	
		TimeZone jnbtz = TimeZone.getTimeZone("GMT");
		System.out.println(jnbtz.getDisplayName());
		dateformat.setTimeZone(jnbtz);
		instance.setTimeZone(jnbtz);
		System.out.println("London date="+dateformat.format(instance.getTime()));
		
		
		
	}
}