package org.javacream.java8.datetime.chronounit;

import static java.lang.System.out;

import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		demoChronoUnit();
	}

	static void demoChronoUnit() {
		for (ChronoUnit u : ChronoUnit.values()) {
			out.println(u);
		}
		out.println(ChronoUnit.SECONDS.compareTo(ChronoUnit.YEARS));
		out.println(ChronoUnit.SECONDS.compareTo(ChronoUnit.DAYS));
		out.println(ChronoUnit.SECONDS.compareTo(ChronoUnit.MINUTES));
	}
}
