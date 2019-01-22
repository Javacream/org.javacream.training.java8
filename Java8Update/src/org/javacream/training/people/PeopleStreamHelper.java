package org.javacream.training.people;

import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleStreamHelper {

    public static Set<Person> findByLastname(Stream<Person> people, String lastname){
	return people.filter(p -> p.getLastname().startsWith(lastname)).collect(Collectors.toSet());
    }
    public static Set<Person> findByBirthDate(Stream<Person> people, ZonedDateTime start, Period period){
	ZonedDateTime end = start.plus(period);
	return people.filter(p -> (p.getDateOfBirth().isBefore(end)&&p.getDateOfBirth().isAfter(start)) ).collect(Collectors.toSet());
    }
}
