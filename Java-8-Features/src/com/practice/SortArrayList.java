package com.practice;

import java.util.*;

class Duck implements Comparator<Integer> {

	@Override
	public int compare(Integer a1, Integer a2) {

		return a2 - a1;
	}

}

public class SortArrayList {

	public static void main(String[] args) {

//		sort element in descending order

		List<Integer> l = new ArrayList<>(Arrays.asList(10, 20, 5, 45, 50));

//		approach 1  lambda

		Collections.sort(l, (a, b) -> b - a);
		System.out.println(l);

		System.out.println("**********************************");
		
		List<Integer> ll = new ArrayList<>(Arrays.asList(10, 20, 5, 45, 50));

//		approach 1  lambda

		Collections.sort(ll, (a, b) -> a > b ? -1 : 1);
		System.out.println(ll);

		System.out.println("**********************************");
//		approach 2 : implementation class with sort method
		List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 5, 45, 8));
		Collections.sort(l2, new Duck());
		System.out.println(l2);

	}
}
