package com.lambdaandanonymsinnerclass;

public class LambdaAnonymous {

	public static void main(String[] args) {
		
		doSomething();
		
	}
	
	public static void doSomething() {
		
//		lambda implementation
		Employee e = ()->{
			return 100;
		};
		
		int salary = e.getSalary();
		System.out.println("Salary from lambda " +salary);
		
		
//		anonymous implementation
		Employee e2 = new Employee() {
			
			@Override
			public int getSalary() {
				return 2000;
			}
		};
		
		int salary2 = e2.getSalary();
		System.out.println("Salary from Anonymous " +salary2);
	}
	

}

