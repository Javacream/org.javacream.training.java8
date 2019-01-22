package org.javacream.training.people;

public class PeopleStreamApplication {

    public static void main(String[] args) {
	PeopleController peopleController = new PeopleController();
	System.out.println(peopleController.findByLastName("Lastname1"));
    }

}
