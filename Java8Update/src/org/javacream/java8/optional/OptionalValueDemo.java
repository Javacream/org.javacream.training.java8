package org.javacream.java8.optional;

import java.util.Optional;

public class OptionalValueDemo {

	public static void main(String[] args) {
		new OptionalValueDemo();
	}
	
	{
		doSomething(Optional.of("Hugo"));
		doSomething(Optional.empty());
	}

	private void doSomething(Optional<String> string) {
		string.ifPresent(System.out::print);
	}
}
