package org.javacream.java8.datetime.period;

import static java.lang.System.out;

import java.time.Period;

public class Application {

    public static void main(String[] args) {
	demoCreation();
	demoGetMethods();
	demoPlusMinus();
	demoParse();
    }

    static void demoCreation() {
	Period p1 = Period.ofYears(1);
	Period p2 = Period.ofYears(1).withMonths(6);
	Period p3 = Period.ofYears(1).withMonths(6).withDays(15);
	out.println(p1);
	out.println(p2);
	out.println(p3);
    }

    static void demoGetMethods() {
	Period p = Period.ofYears(1).withMonths(6).withDays(15);
	out.println(p.getYears());
	out.println(p.getMonths());
	out.println(p.getDays());
    }

    static void demoPlusMinus() {
	Period p = Period.ofYears(1).withMonths(6).withDays(15);
	out.println(p);
	p = p.plusMonths(10);
	p = p.plusDays(10);
	p = p.minusDays(3);
	out.println(p);
    }

    static void demoParse() {
	Period p = Period.parse("P1Y6M15D");
	out.println(p);
    }
}
