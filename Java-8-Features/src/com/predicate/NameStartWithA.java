package com.predicate;

import java.util.function.Predicate;

public class NameStartWithA {

	public static void main(String[] args) {

		String arr[] = { "Java", "Apple", "Anchor", "Box" };

		Predicate<String> isNameStartWithA = name -> name.charAt(0) == ('A');

		for (String name : arr) {
			if (isNameStartWithA.test(name)) {
				System.out.println(name);
			}
		}
		
//		OR
		
		Predicate<String> nameStartA = name -> name.startsWith("A");
		
		for (String name : arr) {
			if (nameStartA.test(name)) {
				System.out.println(name);
			}
		}
	}
}
