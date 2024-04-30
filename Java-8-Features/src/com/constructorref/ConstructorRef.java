package com.constructorref;

import java.util.function.Supplier;

class Java {
	public Java() {
		System.out.println("constructor :: called");
	}
}

public class ConstructorRef {

	public static void main(String[] args) {

		Supplier<Java> j = Java::new;

		System.out.println(j.get().hashCode());
	}
}
