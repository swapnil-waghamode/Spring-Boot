package com.lambda.comparator;

import java.util.Map;
import java.util.TreeMap;

public class LambdaWithMapComparator {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new TreeMap<>();
		m.put(11, "Java");
		m.put(10, "Python");
		m.put(100, "SQL");
		m.put(4, "C++");
		
		System.out.println("Automatic Ascending order as : TreeMap");
		System.out.println(m);
		
		System.out.println();
		System.out.println("Descending order sorting using comparator and lambda");
		
		Map<Integer, String> tm = new TreeMap<>((a,b) -> b-a);
		tm.put(11, "Java");
		tm.put(10, "Python");
		tm.put(100, "SQL");
		tm.put(4, "C++");
		
		System.out.println(tm);
		
	}
}