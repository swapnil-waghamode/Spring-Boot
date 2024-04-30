package com.lambda.comparator;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorWithTreeset {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();
		s.add(10); s.add(4); s.add(6); s.add(18);
		
		System.out.println("Before sorting : Ascending bydefault as TreeSet");
		System.out.println(s);
		
		System.out.println("Descending sort using comparator in TreeSet constructor");
		
		Set<Integer> ts = new TreeSet<>((a,b) -> b-a);
		ts.add(10); ts.add(4); ts.add(6); ts.add(18);
		
		System.out.println(ts);
		
	}
}