package org.javacream.java8.concurrent;

import java.util.concurrent.CompletableFuture;

public class Application {

	public static void main(String[] args) throws Exception {
		System.out.println("result = " + productOfSumAndDiff1Simple(3));
	}


	static int productOfSumAndDiff1Simple(int value) throws Exception {
		final CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> value);
		final CompletableFuture<Integer> f2 = f1.thenApplyAsync(x -> x + 1);
		final CompletableFuture<Integer> f3 = f1.thenApplyAsync(x -> x - 1);
		final CompletableFuture<Integer> f4 = f2.thenCombine(f3, (v1, v2) -> v1 * v2);
		return f4.get();
	}

	
}
