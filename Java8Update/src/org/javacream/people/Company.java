package org.javacream.people;

public class Company implements Addressable{

    private String name;
    
    public String getName() {
        return name;
    }

    public Address getMainAddress() {
        return mainAddress;
    }

    private Address mainAddress;

    public Company(String name, Address mainAddress) {
	super();
	this.name = name;
	this.mainAddress = mainAddress;
    }
    
    @Override
    public Address getAddress() {
	return mainAddress;
    }

    @Override
    public String toString() {
	return "Company [name=" + name + ", mainAddress=" + mainAddress + "]";
    }
}
