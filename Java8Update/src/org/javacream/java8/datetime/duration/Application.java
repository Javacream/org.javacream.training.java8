package org.javacream.java8.datetime.duration;

import static java.lang.System.out;

import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Application {

    public static void main(String[] args) {
	demoCreation1();
	demoCreation2();
	demoGetter();
	demoPlusMinusBetween();
	demoParse();
    }

    static void demoCreation1() {
	Duration d = Duration.of(10, ChronoUnit.MINUTES);
	out.println(d);
	out.println(Duration.of(10, ChronoUnit.SECONDS));
	out.println(Duration.of(10, ChronoUnit.MILLIS));
	out.println(Duration.ofDays(10));
	out.println(Duration.ofHours(10));
	out.println(Duration.ofMinutes(10));
    }

    static void demoCreation2() {
	Duration d = ChronoUnit.MINUTES.getDuration();
	out.println(d);
	out.println(ChronoUnit.SECONDS.getDuration());
	out.println(ChronoUnit.FOREVER.getDuration());
	Duration d1 = Duration.ofDays(10);
	Duration d2 = Duration.ofDays(10);
	out.println(d1.equals(d2));
	out.println(d1 == d2);
    }

    static void demoGetter() {
	Duration d = Duration.of(10_007, ChronoUnit.MILLIS);
	out.println(d.getSeconds());
	out.println(d.getNano());
    }

    static void demoPlusMinusBetween() {
	Duration d = Duration.of(10, ChronoUnit.MINUTES);
	Duration d1 = d.plus(Duration.of(5, ChronoUnit.MINUTES));
	out.println(d1);
	Duration d2 = d.plus(5, ChronoUnit.MINUTES);
	out.println(d2);
	Duration d3 = Duration.between(Instant.now(), Instant.now().plus(10, ChronoUnit.MINUTES));
	out.println(d3);
    }

    static void demoParse() {
	Duration d = Duration.parse("PT15M");
	out.println(d);
	try {
	    Duration.parse("PT15");
	} catch (DateTimeParseException e) {
	    out.println("Expected: " + e.getMessage());
	}
    }

}
