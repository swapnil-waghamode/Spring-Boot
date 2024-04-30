package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> names = (name) -> System.out.println(name + " Good morning");
		names.accept("IT");
		names.accept("Java");

		
		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
		
		nums.forEach(i -> System.out.print(i + " "));
	}
}
