package com.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUsingLambda {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(8); l.add(2); l.add(3); l.add(5);
		
		System.out.println("Before sorting");
		System.out.println(l);
		
	System.out.println("*************************");
		
		System.out.println("Ascending sorting : lambda & comparator");
//		ascending sorting using lambda
		Collections.sort(l , (a,b) -> a-b);
		System.out.println(l);
		
	System.out.println("*************************");
		
		System.out.println("Descending sorting : lambda & comparator");
		
//		Descending sorting using lambda
		Collections.sort(l, (a,b) -> b-a);
		
		System.out.println(l);
	}

}
