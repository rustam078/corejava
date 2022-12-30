package com.fullcreative.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeInbuiltMethod2 {

	public static void main(String[] args) {

		System.out.println("/********************************************/");
		LocalDateTime ldate = LocalDateTime.parse("2022-02-28T15:30:30");
		OffsetDateTime startOfDay = ldate.atOffset(ZoneOffset.of("+02:00"));
		System.out.println(ldate);
		System.out.println(startOfDay);
		LocalTime atTime = ldate.toLocalTime(); 
		LocalDate atDate = ldate.toLocalDate(); 
		System.out.println(atTime);
		System.out.println(atDate);
		

		LocalDateTime sydneytime = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
		System.out.println(sydneytime + " [Australia/Sydney]");
		System.out.println(ldate.compareTo(sydneytime));// both should be same class
		System.out.println(ldate.equals(sydneytime));
		LocalDate from = LocalDate.from(sydneytime); // static method Obtains an instance of LocalDate from a temporal
														// object.
		System.out.println(from);
		System.out.println(ldate.getLong(ChronoField.DAY_OF_MONTH));
		System.out.println(ldate.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(ldate.getLong(ChronoField.YEAR));

		System.out.println("/********************************************/");
		System.out.println(ldate.getDayOfMonth());
		System.out.println(ldate.getMonthValue());
		System.out.println(ldate.getYear());
		System.out.println(ldate.getDayOfYear());
		System.out.println(ldate.getDayOfWeek());
		System.out.println(ldate.getMonth());

		System.out.println(ldate.isAfter(sydneytime));
		System.out.println(ldate.isBefore(sydneytime));
		System.out.println(ldate.isEqual(sydneytime));
		System.out.println(ldate.minus(20, ChronoUnit.YEARS));
		System.out.println(ldate.minus(10, ChronoUnit.MONTHS));
		System.out.println(ldate.minus(14, ChronoUnit.DAYS));
		System.out.println(ldate.minusDays(10));
		System.out.println(ldate.minusMonths(10));
		System.out.println(ldate.minusWeeks(1));
		System.out.println(ldate.minusYears(10));
		System.out.println(LocalDate.ofYearDay(2020, 303));
		System.out.println("/*************/");
		System.out.println(ldate.plus(10, ChronoUnit.DAYS));
		System.out.println(ldate.plusDays(30));
		System.out.println(ldate.plusMonths(1));
		System.out.println(ldate.plusWeeks(1));
		System.out.println(ldate.plusYears(10));
		System.out.println(ldate.with(ChronoField.DAY_OF_YEAR, 32));
		System.out.println(ldate.with(ChronoField.DAY_OF_MONTH, 5));
		System.out.println(ldate.with(ChronoField.DAY_OF_WEEK, 2));
		System.out.println();
		System.out.println(ldate.withDayOfYear(300));
		System.out.println(ldate.withDayOfMonth(10));
		System.out.println(ldate.withMonth(10));
		System.out.println(ldate.withYear(3333));
		System.out.println(ldate.range(ChronoField.DAY_OF_MONTH));
		System.out.println(ldate.range(ChronoField.DAY_OF_WEEK));
		System.out.println(ldate.range(ChronoField.DAY_OF_YEAR));
		System.out.println(ldate.withDayOfYear(303));

	}
}