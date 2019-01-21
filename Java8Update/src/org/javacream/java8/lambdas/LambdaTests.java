package org.javacream.java8.lambdas;

import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTests {

	@Test public void testLambda(){
		Runnable r = () -> System.out.println("Hello");
		r.run();
	}
	
	@Test public void testMethodReference(){
		Consumer<String> c = System.out::println;
		c.accept("HUHU");
	}
	@Test public void testFunctionalInterfaces(){
		Consumer<String> c = System.out::println;
		c.accept("HUHU");
	}
}
