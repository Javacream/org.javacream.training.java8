package org.javacream.java8.interfaces;

public class ImplementingClass implements Java8Interface {

	@Override
	public String getDescription() {
		return "Override " + Java8Interface.super.getDescription();
	}


	@Override
	public void doSomething() {
		System.out.println(getDescription());

	}


	public static void main(String[] args) {
		ImplementingClass ic = new ImplementingClass();
		ic.doSomething();
		System.out.println(Java8Interface.doSomethingStatic());
	}

}
