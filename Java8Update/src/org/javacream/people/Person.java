package org.javacream.people;

public class Person implements Addressable {

    private String lastname;
    private String firstname;
    private Character gender;
    private Integer height;

    private Address address;

    /* (non-Javadoc)
     * @see org.javacream.people.Addressable#getAddress()
     */
    @Override
    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
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

    public Person(String lastname, String firstname, Character gender, Integer height) {
	super();
	this.lastname = lastname;
	this.firstname = firstname;
	this.gender = gender;
	this.height = height;
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
	return "Person [lastname=" + lastname + ", firstname=" + firstname + ", gender=" + gender + ", height=" + height
		+ "]";
    }

    public String sayHello() {
	return "Hello, my name is " + this.firstname + " " + this.lastname;
    }

    private Person partner;

    public Boolean marry(Person newPartner) {
	if ((this.partner == null) && (newPartner.partner == null) && (newPartner != this)) {
	    this.partner = newPartner;
	    newPartner.partner = this;
	    return true;
	} else {
	    return false;
	}
    }

    public Boolean divorce() {
	if (this.partner != null) {
	    this.partner.partner = null;
	    this.partner = null;
	    return true;
	} else {
	    return false;
	}
    }

}
