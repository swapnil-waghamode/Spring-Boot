package com.functioninter;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> length = (name) -> name.length();

		System.out.println(length.apply("Java"));
		System.out.println(length.apply("Python"));
		System.out.println(length.apply("Royal Challengers Bangalore"));
	}
}
