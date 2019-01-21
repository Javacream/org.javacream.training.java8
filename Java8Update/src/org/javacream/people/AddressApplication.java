package org.javacream.people;

public class AddressApplication {

    public static void main(String[] args) {
	Address a = new Address("München", "Lindwurmstr");
	AddressNormalizer addressNormalizer = new AddressNormalizer();
	Address normalized = addressNormalizer.normalize(a);
	System.out.println(normalized);
    }

}
