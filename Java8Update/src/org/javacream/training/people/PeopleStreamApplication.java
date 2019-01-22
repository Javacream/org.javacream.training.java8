package org.javacream.training.people;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeopleStreamApplication {

    public static void main(String[] args) {
	PeopleController peopleController = new PeopleController();
	System.out.println(peopleController.findByLastName("Lastname1"));
	System.out.println(peopleController.findByBirthDate(ZonedDateTime.of(2018, 3, 12, 0, 0, 0, 0, ZoneId.systemDefault()), Period.ofDays(27)).size());
    }

}
