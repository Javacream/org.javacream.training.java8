package org.javacream.training.people;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleStreamHelper {

    public static Set<Person> findByLastname(Stream<Person> people, String lastname){
	return people.filter(p -> p.getLastname().startsWith(lastname)).collect(Collectors.toSet());
    }
}
