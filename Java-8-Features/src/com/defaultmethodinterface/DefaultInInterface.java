package com.defaultmethodinterface;

// From java 8 we can have default methods inside interface
interface Parent {
	default void sayHello() {
		System.out.println("Hello Java");
	}
}

class Child implements Parent {
	
	@Override
	public void sayHello() {
		System.out.println("Child says Hello");
	}

}

public class DefaultInInterface {

	public static void main(String[] args) {

		Child c = new Child();
		c.sayHello();
	}
}
