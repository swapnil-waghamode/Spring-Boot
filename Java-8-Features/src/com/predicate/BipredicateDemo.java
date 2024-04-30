package com.predicate;

import java.util.function.BiPredicate;

public class BipredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> sum = (i , j) -> i + j >= 20;
		boolean test = sum.test(10, 20);
		if(test) {
			System.out.println("Sum is greater than equals 20");
		}
	}
}
