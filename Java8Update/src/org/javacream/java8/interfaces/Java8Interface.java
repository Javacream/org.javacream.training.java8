package org.javacream.java8.interfaces;

public interface Java8Interface {
	default public String getDescription(){
		return "I AM DEFAULT";
	}
	public void doSomething();
	
	static String doSomethingStatic(){
		return "doing something static...";
	}
}
