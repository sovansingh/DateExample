package com.app.instant;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantEx {

	public static void main(String[] args) {
		Instant instant = Instant.parse("2017-02-03T10:37:30.00Z");
		System.out.println("instant : "+instant);
		
		Instant instant2 = Instant.now();
		System.out.println("instant2 : "+instant2);
		
		Instant instant3 = Instant.parse("2017-02-03T10:37:30.00Z");
		instant3 = instant3.minus(Duration.ofDays(15));
		System.out.println("instant3 : "+instant3);
	
		Instant instant4 = Instant.parse("2017-02-03T10:37:30.00Z");
		instant4 = instant4.plus(Duration.ofDays(15));
		System.out.println("instant4 : "+instant4);
		
		Instant instant5 = Instant.parse("2017-02-03T10:37:30.00Z");
		System.out.println(instant5.isSupported(ChronoUnit.YEARS));
		System.out.println(instant5.isSupported(ChronoUnit.DAYS));
		System.out.println(instant5.isSupported(ChronoUnit.MONTHS));
	}
}
