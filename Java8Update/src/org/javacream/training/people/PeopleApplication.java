package org.javacream.training.people;

import org.javacream.training.address.Address;
import org.javacream.training.companies.Company;

public class PeopleApplication {

    public static void main(String[] args) {
	Person p = new Person("Sawitzki", "Rainer", 'm', 183);
	Address a = new Address("München", "Marienplatz");
	p.setAddress(a);
	System.out.println(p.sayHello());
	
	System.out.println(a.getStreet());
	p.getAddress().setStreet("Karlsplatz");
	System.out.println(a.getStreet());
	Person p2 = new Person("Mustermann", "Andrea", 'x', 176);
	p.marry(p2);
	p2.divorce();
	
	p.printAddress();
	
	Company c = new Company("Javacream", new Address("Berlin", "Alexanderplatz"));
	c.printAddress();
	
	System.out.println(c.getPostalCode());
    }

}
