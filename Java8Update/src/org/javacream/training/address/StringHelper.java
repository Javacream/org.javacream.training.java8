package org.javacream.training.address;

public class StringHelper {
    private boolean toUpper;

    public StringHelper(boolean toUpper) {
	super();
	this.toUpper = toUpper;
    }

    public String convertIt(String s) {
	System.out.println("converting using " + this);
	if (toUpper) {
	    return s.toUpperCase();
	} else {
	    return s.toLowerCase();
	}
    }
}
