package com.fullcreative.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.TimeZone;

public class UTCDateTime1 {

	public static void main(String[] args) {

		// using java.util.Date
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Dubai")); // this is used to set a date to any time zone like UTC IST BST CET
		Date dat = new Date();
		System.out.println(dat);

		// Instant
		// using java.time
		Instant i = Instant.now();
		System.out.println(i); // it will give universal time 'z' means universal utc time which is determined
								// by Greenwich England

		ZonedDateTime local = i.atZone(ZoneId.of("UTC")); // utc time
		System.out.println(local);
		System.out.println(local.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

		System.out.println("/**********************************************************************/");

	}
}