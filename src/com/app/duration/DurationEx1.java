package com.app.duration;

import java.time.Duration;
import java.time.LocalTime;

public class DurationEx1 {

	public static void main(String[] args) {
		Duration duration = Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(duration.getSeconds());
		
		Duration duration2 =  duration.minus(duration);
		System.out.println(duration2.getSeconds());
		
		Duration duration3 = duration.plus(duration);
		System.out.println(duration3.getSeconds());
	}
}
