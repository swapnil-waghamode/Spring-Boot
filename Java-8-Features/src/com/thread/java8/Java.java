package com.thread.java8;

public class Java {

	public static void main(String[] args) {
		
//		Using Runnable interface with lambdas
		Runnable runable = ()->{
		     for (int i = 1; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
				}
			}
		};
		
		Thread t = new Thread(runable);
		t.run();
	}
}
