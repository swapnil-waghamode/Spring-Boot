package com.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 8, 0));

		list.forEach(i -> System.out.print(i + " "));

	}
}
