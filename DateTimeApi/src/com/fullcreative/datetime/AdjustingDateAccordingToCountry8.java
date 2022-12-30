package com.fullcreative.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AdjustingDateAccordingToCountry8 {

	public static void main(String[] args) {

		System.out.println("/********************************************/");
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		LocalDate date = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println(date);
		date2 = (LocalDate) date.adjustInto(date2);
		System.out.println(date2);

		System.out.println("/********************************************/");
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		LocalDateTime dat = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println(dat);
		dat = (LocalDateTime) date3.adjustInto(dat);
		System.out.println(dat);

		System.out.println("/********************************************/");
		LocalDateTime dat4 = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println(dat4);
		ZonedDateTime date4 = ZonedDateTime.now();
		System.out.println(date4);

		date4 = (ZonedDateTime) dat4.adjustInto(date4); // this method is not available into ZonedDateTime 1st argument
														// always be LocaleDate or LocalDateTime
		System.out.println(date4);
		System.out.println("/********************************************/");
		
		LocalDate currdate = LocalDate.now();
		Month month2 = Month.of(2);
		// Uses the function to adjust the date
		currdate = (LocalDate) month2.adjustInto(currdate);
		System.out.println("Current day = " + currdate);
		System.out.println(month2);
		System.out.println(currdate);
	}
}