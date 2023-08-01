package com.app.dayofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeekEx1 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2023, Month.JULY, 17);
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
		System.out.println(dayOfWeek.getValue());
		dayOfWeek = dayOfWeek.plus(3);
		System.out.println(dayOfWeek.getValue());
	}
}
