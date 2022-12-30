package com.fullcreative.datetime;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class ListOfTimeZone4 {

	public static void main(String[] args) {

		System.out.println("/********************************************/");

//		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    String[] availableIDs = TimeZone.getAvailableIDs();		
		for (String zoneidd : availableIDs) {
			displayTimeZone(TimeZone.getTimeZone(zoneidd));
		}
	}

	public static void displayTimeZone(TimeZone tz) {
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);
		minutes = Math.abs(minutes);
		if (hours >0) {
			System.out.println(String.format("GMT+%d:%02d %s", hours, minutes, tz.getID()));
		} else {

			System.out.println(String.format("GMT%d:%02d %s", hours, minutes, tz.getID()));
		}
	}
}