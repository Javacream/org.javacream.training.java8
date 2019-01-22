package org.javacream.training.people;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import org.javacream.training.address.Address;

public class PeopleController {

    private Map<Long, Person> peopleMap;
    private Random random;
    
    {
	peopleMap = new HashMap<>();
	random = new Random(System.currentTimeMillis());
	Address a1 = new Address("München", "Marienplatz");
	Address a2 = new Address("Stuttgart", "Schlossplatz");
	Address a3 = new Address("Berlin", "Alexanderplatz");
	Address a4 = new Address("Zwickau", "Hauptplatz");
	List<Address> addresses = new ArrayList<>(4);
	addresses.add(a1);
	addresses.add(a2);
	addresses.add(a3);
	addresses.add(a4);
	
	for (int i = 0; i < 100; i++) {
	    	char gender = i%2==0?'m':'f';
	    	int month = i%10 + 1;
	    	int day = i%20 + 1 ;
		ZonedDateTime dateOfBirth = ZonedDateTime.of(2018, month, day, month, day, 42, 0, ZoneId.systemDefault());
	    	Person p = new Person("Lastname" + i, "Firstname" + i, gender, (int)(120 + 0.5*i));
		p.setAddress(addresses.get(i%4));
		p.setDateOfBirth(dateOfBirth);
		save(p);
	}
    }
    public void save(Person p) {
	p.setId(random.nextLong());
	peopleMap.put(p.getId(), p);
    }
    public void update(Person p) {
	peopleMap.put(p.getId(), p);
    }
    public void deleteById(Long id) {
	peopleMap.remove(id);
    }
    public Optional<Person> findById(Long id) {
	return Optional.ofNullable(peopleMap.get(id));
    }
    
    public Set<Person> findByLastName(String lastname){
	return PeopleStreamHelper.findByLastname(peopleMap.values().stream(), lastname);
    }
    public Set<Person> findByBirthDate(ZonedDateTime start, Period period){
	return PeopleStreamHelper.findByBirthDate(peopleMap.values().stream(), start, period);
    }
    
}
