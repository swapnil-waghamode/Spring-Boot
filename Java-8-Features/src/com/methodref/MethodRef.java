package com.methodref;

interface MyInterface {
	public void m1();
}

public class MethodRef {

	public static void m2() {
		System.out.println("m2() called");
	}

	public static void main(String[] args) {

		MyInterface m1 = MethodRef::m2;
		m1.m1();
	}
}
