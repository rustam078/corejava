package com.fullcreative.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormattingCurrentDate3 {

	public static void main(String[] args) {

		// LocalDateTime
		LocalDateTime date = LocalDateTime.now();
		LocalDate atDate = date.toLocalDate(); 
		LocalTime atTime = date.toLocalTime(); 
		System.out.println(date);
		System.out.println(atDate);
		System.out.println(atTime);
		

		// Formatting yyyy - mm - dd and hh : mm :ss

		// Date
		int dd = date.getDayOfMonth(); // return date
		int mm = date.getMonthValue(); // return month
		int yyyy = date.getYear(); // return year
		System.out.printf("\n%d-%d-%d", dd, mm, yyyy);
		DayOfWeek dow = date.getDayOfWeek(); // we can use toString to convert into String->return day of that date
		Month mn = Month.of(mm); // retrun month name
		Month month = date.getMonth();
		System.out.printf("\n%.3s-%.3s/%.4s-%d", dow, mn, month, yyyy); // u can use printf to format the string

		// Time
		int hour = date.getHour();
		int min = date.getMinute();
		int sec = date.getSecond();
		int nano = date.getNano() / 10000000;
		if (hour > 12) {
			hour -= 12;
		}
		System.out.printf("\n%02d:%02d:%02d:%02d\n", hour, min, sec, nano);
		System.out.println("/******************************************************************/");

		// DateTimeformatter 2nd way
		DateTimeFormatter dtformatter1 = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy"); // if u give mm in month than
		DateTimeFormatter dtformatter2 = DateTimeFormatter.ofPattern("HH::mm::ss"); // if u give mm in month than
																					// it will take time
		DateTimeFormatter dtformatter3 = DateTimeFormatter.ISO_LOCAL_DATE;

		DateTimeFormatter dtformatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtformatter5 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter dtformatter6 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String format1 = date.format(dtformatter1);
		System.out.println(format1);
		String format2 = date.format(dtformatter2);
		System.out.println(format2);
		String format3 = date.format(dtformatter3);
		System.out.println(format3);
		String format4 = date.format(dtformatter4);
		System.out.println(format4);
		String format5 = date.format(dtformatter5);
		System.out.println(format5);
		String format6 = date.format(dtformatter6);
		System.out.println(format6);
		format6 = format6.replace(',', ' ');
		System.out.println(format6);

		System.out.println("/******************************************************************/");
		System.out.println("/**********************************************/");
		
		// this is used when we want format String
		System.out.println("Enum = " + dow);
		System.out.println("Enum = " + month);
		String dayName = dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		System.out.println("FULL = " + dayName);

		dayName = dow.getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
		System.out.println("FULL_STANDALONE = " + dayName);

		dayName = dow.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
		System.out.println("NARROW = " + dayName);

		dayName = dow.getDisplayName(TextStyle.NARROW_STANDALONE, Locale.ENGLISH);
		System.out.println("NARROW_STANDALONE = " + dayName);

		dayName = dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		System.out.println("SHORT = " + dayName);

		dayName = dow.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.ENGLISH);
		System.out.println("SHORT_STANDALONE = " + dayName);
	}
}