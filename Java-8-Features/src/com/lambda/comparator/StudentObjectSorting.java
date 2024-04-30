package com.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentObjectSorting {

	public static void main(String[] args) {

		Student s1 = new Student(100, "Robert");
		Student s2 = new Student(50, "Joker");
		Student s3 = new Student(300, "RCB");

		List<Student> ls = new ArrayList<>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);

		System.out.println("Before sorting");
		System.out.println(ls);

		System.out.println("After sorting : Ascending ");

		Collections.sort(ls, (a, b) -> a.id - b.id);
		System.out.println(ls);

		System.out.println("After sorting : Descending ");

		Collections.sort(ls, (a, b) -> b.id - a.id);
		System.out.println(ls);

	}

}
