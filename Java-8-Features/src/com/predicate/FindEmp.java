package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	String location;
	String dept;

	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}

}

public class FindEmp {

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee("Raju", "Chennai", "Devops"),
				new Employee("Rani", "Pune", "Networking"), new Employee("Ashok", "Hyd", "DB"),
				new Employee("Ganesh", "Hyd", "Testing"));

//		Creating 2 different predicates for location & Department

		Predicate<Employee> p1 = e -> e.location.equals("Hyd");

		Predicate<Employee> p2 = e -> e.dept.equals("DB");

//		Combining predicate

		Predicate<Employee> p = p1.and(p2);

		for (Employee e : emp) {
			if (p.test(e)) {
				System.out.println("Name of employee working in Hyderabad in DB dept is : " + e.name);
			}
		}

	}
}
