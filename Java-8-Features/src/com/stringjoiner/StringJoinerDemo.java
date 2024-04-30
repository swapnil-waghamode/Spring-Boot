package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
//		delimiter
		StringJoiner sj = new StringJoiner("-");
		sj.add("Java");
		sj.add("Program");
		sj.add("01");
		
		System.out.println(sj);
		
//		prefix , suffix
		StringJoiner sj2 = new StringJoiner("-","(",")");
		sj2.add("Ashok");
		sj2.add("IT");
		sj2.add("Java");
		
		System.out.println(sj2);
	}
}
