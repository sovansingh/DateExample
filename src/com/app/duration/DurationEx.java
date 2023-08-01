package com.app.duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationEx {

	public static void main(String[] args) {
		Duration duration = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(duration.get(ChronoUnit.SECONDS));
		
		Duration duration2 = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(duration2.isNegative());
		
		Duration duration3 = Duration.between(LocalTime.MAX, LocalTime.NOON);
		System.out.println(duration3.isNegative());
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
	}
}
