package com.app.dayofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeekEx {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2023, Month.JANUARY, 25);
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
		System.out.println(dayOfWeek);
		
		DayOfWeek dayOfWeek2 = DayOfWeek.of(5);
		System.out.println(dayOfWeek2.name());
		System.out.println(dayOfWeek2.ordinal());
		System.out.println(dayOfWeek2.getValue());
	}
}
