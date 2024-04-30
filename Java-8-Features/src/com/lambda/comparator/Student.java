package com.lambda.comparator;

public class Student {

	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return this.id +" "+ this.name;
	}
}
