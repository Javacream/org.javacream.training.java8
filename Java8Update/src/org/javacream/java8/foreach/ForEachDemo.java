package org.javacream.java8.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		new ForEachDemo();
	}

	{
		String[] messagesAsArray = { "A", "B", "C" };
		List<String> messagesAsList = Arrays.asList(messagesAsArray);
		messagesAsList.forEach((element) -> System.out.println(element));
	}
}