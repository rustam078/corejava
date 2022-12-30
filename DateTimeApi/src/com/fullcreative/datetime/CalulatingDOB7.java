package com.fullcreative.datetime;

import java.time.LocalDate;
import java.time.Period;

public class CalulatingDOB7{

	public static void main(String[] args) {

		// current LocalDate
		LocalDate currdate = LocalDate.now();
		System.out.println("Current day = "+currdate);

		// date of birth
		LocalDate birthdate = LocalDate.of(1998, 7, 15);
		System.out.println("date of birth = "+birthdate);
		
		//period
		Period dob = Period.between(birthdate, currdate);  //work only with local date
		System.out.println("My age = "+dob);
		System.out.println(dob.getDays() + "day " + dob.getMonths() + "month " + dob.getYears()+"year");

	}
}