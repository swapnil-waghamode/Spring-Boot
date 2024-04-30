package com.methodref;

public class InstanceMethofRef {

	public void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		InstanceMethofRef ir = new InstanceMethofRef();

		Runnable r = ir::m1;

		Thread t = new Thread(r);

		t.start();

	}
}
