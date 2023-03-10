package com.fullcreative.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class CurrentDateTime2 {

	public static void main(String[] args) {

		// using java.util.Date
		Date dat = new Date();
		System.out.println(dat);

		// LocalDate
		LocalDate currdate = LocalDate.now();
		System.out.println(currdate);

		// LocalTime
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// LocalDateTime
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		
		//ZonedDateTime
		ZonedDateTime zdtt = ZonedDateTime.now();
		System.out.println(zdtt); // return local time
	

		System.out.println("/**********************************************************************/");
              long time2 = dat.getTime();  //use for testting purpose return time in nano sec
              System.out.println(time2);
	}
}