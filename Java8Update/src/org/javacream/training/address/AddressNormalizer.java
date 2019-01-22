package org.javacream.training.address;

import java.util.LinkedList;
import java.util.List;

public class AddressNormalizer {

    private List<StringNormalizer> cityNormalizers;
    private List<StringNormalizer> streetNormalizers;

    {
	StringHelper helper = new StringHelper(true);
	cityNormalizers = new LinkedList<>();
	streetNormalizers = new LinkedList<>();
	StringNormalizer toUpper = StringUtils::convertToUpper;// (String input) -> {return input.toUpperCase();};
	cityNormalizers.add(toUpper);
	streetNormalizers.add(helper::convertIt);
	streetNormalizers.add((String input) -> {
	    if (input.endsWith("STR")) {
		input = input + "ASSE";
	    }
	    return input;
	});
    }

    public Address normalize(Address a) {
	String normalizedCity = normalize(a.getCity(), cityNormalizers);
	String normalizedStreet = normalize(a.getStreet(), streetNormalizers);
	return new Address(normalizedCity, normalizedStreet);
    }

    private String normalize(String input, List<StringNormalizer> normalizers) {
	String result = input;
	for (StringNormalizer sn : normalizers) {
	    result = sn.normalize(result);
	}
	return result;

    }

}
