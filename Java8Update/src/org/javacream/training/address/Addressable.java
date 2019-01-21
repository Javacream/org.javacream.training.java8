package org.javacream.training.address;

public interface Addressable {

    Address getAddress();
    default String getCity() {
	return getAddress().getCity();
    }
    default String getStreet() {
	return getAddress().getStreet();
    }
    default void printAddress() {
	System.out.println(this.toString() + " resides at " + getAddress());
    }
    
    default String getPostalCode() {
	return new SimplePostalCodes().retrivePostalCode(getCity(), getStreet());
    }
    /*
    //Erst ab Java 9    
    private void demo() {
	
    }
    */
}