package org.javacream.training.scratch;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {
	new FunctionalInterfacesDemo();
    }
    
    {
	consumerDemo((String s) -> {System.out.println(s.length());});
	consumerDemo(System.out::println);
	supplierDemo(() -> {return "Hugo";});
	functionDemo((String s) -> {return 42;});
    }
    public void consumerDemo(Consumer<String> consumer) {
	consumer.accept("Hugo");
    }

    public void supplierDemo(Supplier<String> supplier) {
	String product = supplier.get();
	System.out.println(product);
    }
    public void functionDemo(Function<String, Integer> function) {
	Integer result = function.apply("Hugo");
	System.out.println(result);
    }

}
