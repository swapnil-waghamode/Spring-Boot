package com.lambda.comparator;

import java.util.Comparator;

public class MyClass implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		
//		here a-b for ascending order & b-a for descending order
		
		return b - a;
	}
	
}
