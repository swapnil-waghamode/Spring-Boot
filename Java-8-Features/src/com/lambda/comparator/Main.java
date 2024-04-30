package com.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(8); l.add(2); l.add(3); l.add(5);
		
		System.out.println("Before sorting");
		System.out.println(l);
		
		System.out.println("*************************");
		
		System.out.println("After sorting : Ascending");
		Collections.sort(l);
		System.out.println(l);
		
	System.out.println("*************************");
		
		System.out.println("After sorting : descending using comparator");
		
//		We have to pass implementation class object as parameters to sort method
		Collections.sort(l, new MyClass());
		
		System.out.println(l);
	}
}
