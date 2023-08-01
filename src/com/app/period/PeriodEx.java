package com.app.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodEx {

	public static void main(String[] args) {
		Period period = Period.ofDays(24);
		Temporal temporal = period.addTo(LocalDate.now());
		System.out.println(temporal);
		
		Period period2 = Period.of(2017,04,16);
		System.err.println(period2.toString());
		
		Period period3 = Period.ofMonths(4);
		Period period4 = period3.minus(Period.ofMonths(2));
		System.out.println(period4);
		
		Period period5 = Period.ofMonths(4);
		Period period6 = period5.plus(Period.ofMonths(2));
		System.out.println(period6);
	}
}
