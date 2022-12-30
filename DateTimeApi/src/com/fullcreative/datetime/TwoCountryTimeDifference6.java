package com.fullcreative.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TwoCountryTimeDifference6 {

	public static void main(String[] args) {

		LocalDateTime localtime = LocalDateTime.now();
		String india = localtime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
		System.out.println("India Time= " + india); // return local time

		LocalDateTime americatime = LocalDateTime.now(ZoneId.of("America/Chicago"));
		String chicago = americatime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
		System.out.println("Chicago time= " + chicago);

		ZonedDateTime lon = ZonedDateTime.now(ZoneId.of("Europe/London"));
		String london = lon.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
		System.out.println("London time= " + london);

		Duration duration = Duration.between(localtime, lon); // ulta (lon,localtime) show CE because of different class
																// support Temporal Interface Implement class as
																// argument
		System.out.println(duration);
		System.out.println("difference btn india and london time = " + Math.abs(duration.toHoursPart()) + ":"
				+ Math.abs(duration.toMinutesPart()));


		Duration duration2 = Duration.between(localtime, americatime); // work fine if both class is localdatetime
		System.out.println(duration2);
		String result = (localtime.isAfter(americatime) == true) ? "+" : "-";
		System.out.println("difference btn india and america time = " + Math.abs(duration2.toHoursPart()) + ":"
				+ Math.abs(duration2.toMinutesPart()) + " " + result);

		System.out.println("/**********************************************************************/");

	}
}