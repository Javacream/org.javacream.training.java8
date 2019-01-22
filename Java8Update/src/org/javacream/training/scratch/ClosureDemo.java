package org.javacream.training.scratch;

import org.javacream.training.address.StringNormalizer;

public class ClosureDemo {

    public static void main(String[] args) {
	new ClosureDemo();
    }

    {
	StringNormalizer result = outer();
	try {
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	StringNormalizer result2 = outer();
	result.normalize("PARAM");
	result2.normalize("EGAL");
    }

    public StringNormalizer outer() {
	//outerVar = local var
	@SuppressWarnings("unused")
	String noClosure = "";
	String outerVar = "OUTER " + System.currentTimeMillis();
	System.out.println("in outer: " + outerVar);
	StringNormalizer sn = (input) -> {
	    System.out.println("outerVar=" + outerVar);
	    System.out.println("param: " + input);
	    return input;
	};
	//sn.normalize("PARAM");
	return sn;
    }
}
