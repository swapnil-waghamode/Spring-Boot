package com.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> i > 10;

		System.out.println("is i > 10 -> " + p.test(5));
		System.out.println("is i > 10 -> " + p.test(15));
	}
}
