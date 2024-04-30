package com.lambdaandanonymsinnerclass;

public class AnonymousClass {

	public static void main(String[] args) {
		
//		Anonymous implementation/ anonymous inner class
		Employee e = new Employee() {
			
			@Override
			public int getSalary() {
				
				return 100000;
			}
			
		};
		
		
		System.out.println("salary "+ e.getSalary());
	}
}
