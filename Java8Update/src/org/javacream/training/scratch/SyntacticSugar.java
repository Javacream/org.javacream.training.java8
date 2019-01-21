package org.javacream.training.scratch;

import org.javacream.training.address.StringNormalizer;

public class SyntacticSugar {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
	StringNormalizer toUpper = (String input) -> {return input.toUpperCase();};
	//Type Inference
	StringNormalizer toUpper2 = (input) -> {return input.toUpperCase();};
	//Default return
	StringNormalizer toUpper3 = (input) -> input.toUpperCase();
	//Optional ()
	StringNormalizer toUpper4 = input -> input.toUpperCase();
    }

}
