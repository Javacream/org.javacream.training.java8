package org.javacream.training.people;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.javacream.training.address.Address;
import org.javacream.training.address.Addressable;

public class Person implements Addressable {

    public Person(String lastname, String firstname, Character gender, Integer height) {
	super();
	this.lastname = lastname;
	this.firstname = firstname;
	this.gender = gender;
	this.height = height;
	this.dateOfBirth = ZonedDateTime.now();
    }
    private ZonedDateTime dateOfBirth;
    public ZonedDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    private Long id;
    private String lastname;
    private String firstname;
    private Character gender;
    private Integer height;

    private Optional<Address> address;
    
    {
	partner = Optional.empty();
    }

    /* (non-Javadoc)
     * @see org.javacream.people.Addressable#getAddress()
     */
    @Override
    public Address getAddress() {
	return address.orElse(new Address("unknown", "unknown"));
    }

    public void setAddress(Address address) {
	this.address = Optional.of(address);
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public Integer getHeight() {
	return height;
    }

    public void setHeight(Integer height) {
	this.height = height;
    }

    public String getFirstname() {
	return firstname;
    }

    public Character getGender() {
	return gender;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((height == null) ? 0 : height.hashCode());
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Person other = (Person) obj;
	if (firstname == null) {
	    if (other.firstname != null)
		return false;
	} else if (!firstname.equals(other.firstname))
	    return false;
	if (gender == null) {
	    if (other.gender != null)
		return false;
	} else if (!gender.equals(other.gender))
	    return false;
	if (height == null) {
	    if (other.height != null)
		return false;
	} else if (!height.equals(other.height))
	    return false;
	if (lastname == null) {
	    if (other.lastname != null)
		return false;
	} else if (!lastname.equals(other.lastname))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Person [dateOfBirth=" + dateOfBirth + ", id=" + id + ", lastname=" + lastname + ", firstname="
		+ firstname + ", gender=" + gender + ", height=" + height + ", address=" + address + ", partner="
		+ partner + "]";
    }

    public String sayHello() {
	return "Hello, my name is " + this.firstname + " " + this.lastname;
    }

    private Optional<Person> partner;

    public Boolean marry(Person newPartner) {
	if ((!this.partner.isPresent()) && (!newPartner.partner.isPresent()) && (newPartner != this)) {
	    this.partner = Optional.of(newPartner);
	    newPartner.partner = Optional.of(this);
	    return true;
	} else {
	    return false;
	}
    }

    public Boolean divorce() {
	if (this.partner.isPresent()) {
	    this.partner.get().partner = Optional.empty();
	    this.partner = Optional.empty();
	    return true;
	} else {
	    return false;
	}
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
