package org.javacream.training.people;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.javacream.training.address.Address;

public class PeopleFileApplication {

    public static void main(String[] args) throws Exception{
	List<String> content = Files.readAllLines(Paths.get("./people.dat"));
	Stream<Person> peopleStream = content.stream().map(PeopleFileApplication::parse);
	System.out.println(PeopleStreamHelper.findByLastname(peopleStream, "Mü"));
    }

    public static Person parse(String line) {
	String[] data = line.split(",");
	Person p = new Person(data[0], data[1], data[2].charAt(0), Integer.parseInt(data[3]));
	Address a = new Address(data[4], data[5]);
	p.setAddress(a);
	return p;
    }
}
