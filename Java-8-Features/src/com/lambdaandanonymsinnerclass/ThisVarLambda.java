package com.lambdaandanonymsinnerclass;

public class ThisVarLambda {
	
    int k = 340;
	
	public void doSomething() {

		int y = 1000;
		
		Employee e = () -> {
//			y = 5; y won't get modify as it become final variable
			System.out.println(this.k);  // k is accessed using this 
			return 10;
		};
		
		Employee emp = new Employee() {
			
			int x = 40;
			@Override
			public int getSalary() {
//				Here x can be modified as it is instance variable to anonymous class
				int y = 50;
				System.out.println(y);
				System.out.println(this.x);
				return 100;
			}
		};
	}
	

}
