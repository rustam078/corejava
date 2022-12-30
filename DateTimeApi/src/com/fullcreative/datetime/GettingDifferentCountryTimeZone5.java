package com.fullcreative.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.TimeZone;

public class GettingDifferentCountryTimeZone5 {

	public static void main(String[] args) {

		// 1st approach using Instant class
		Instant i = Instant.now();
		System.out.println(i);

		ZonedDateTime local = i.atZone(ZoneId.of("UTC")); // utc time
		ZonedDateTime local1 = i.atZone(ZoneId.of("GMT+05:30")); // based in utc time
		ZonedDateTime local2 = i.atZone(ZoneId.of("America/Chicago")); // utc time
		System.out.println(local);
		System.out.println(local1);
		System.out.println(local2);
		System.out.println(local2.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

		System.out.println("/********************************/");
		System.out.println("/********************************/");

		// 2nd approach using LocalDateTime class
		LocalDateTime americtime = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println(americtime + " [America/Chicago]");
		LocalDateTime londontime = LocalDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londontime + " [Europe/London]");

		LocalDate americaDate = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println("Chicago Date= "+americaDate);
		System.out.println("/********************************/");
		System.out.println("/********************************/");

		// 3rd approach using ZonedDateTime class
		ZonedDateTime zdtt = ZonedDateTime.now();
		System.out.println(zdtt); // return local time

		ZonedDateTime americatime = ZonedDateTime.now(ZoneId.of("GMT-05:00")); // u can also give "America/Chicago"
		System.out.println(americatime + " [America/Chicago]");

		ZonedDateTime lon = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(lon);

		System.out.println("/*****************************************/");
		System.out.println("/*****************************************/");// formatting
		System.out.println(
				"Chicago time= " + americatime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println("London time= " + lon.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

		System.out.println("/*****************************************/");
		System.out.println("/*****************************************/");

		// 4th approach using factory method withZoneSameInstant()
		ZonedDateTime zdtime = ZonedDateTime.now();
		ZonedDateTime withZoneSameInstant = zdtime.withZoneSameInstant(ZoneId.of("America/Chicago"));
		System.out.println(withZoneSameInstant);

		ZonedDateTime withZoneSameInstant2 = zdtime.withZoneSameInstant(ZoneId.of("Europe/London"));
		System.out.println(withZoneSameInstant2);

		System.out.println("/*************************************/");
		// using java.util.Date
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		Date dt = new Date();
		System.out.println(dt);

	}
}