package com.predicate;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class AgeGreaterThan18 {

	public static void main(String[] args) {

//		List<Person> person = new ArrayList<>();
//
//		person.add(new Person("Ajax", 18));
//		person.add(new Person("Cobol", 28));
//		person.add(new Person("Pascal", 20));
//		person.add(new Person("Ruby", 10));
//		person.add(new Person("C#", 19));
//		person.add(new Person("GO", 6));
		
		List<Person> person = 
				Arrays.asList(
						new Person("Ajax", 18),
						new Person("Cobol", 28),
						new Person("Pascal", 20),
						new Person("Ruby", 10),
						new Person("C#", 19),
						new Person("GO", 6)
				);

		Predicate<Integer> p = age -> age >= 18;

		for (int i = 0; i < person.size(); i++) {

			if (p.test(person.get(i).age)) {
				System.out.println(person.get(i).name);
			}
		}
		
		
		System.out.println("******************************");
//		OR
		
		Predicate<Person> pr = per -> per.age >=18;
		
		for(Person prs: person) {
			
			if(pr.test(prs)){
				System.out.println(prs.name);
			}
		}
	}
}
