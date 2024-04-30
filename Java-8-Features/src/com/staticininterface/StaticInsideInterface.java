package com.staticininterface;

interface MyInterface {

	static void sayHello() {
		System.out.println("Hello Java");
	}
}

public class StaticInsideInterface implements MyInterface {

	public static void main(String[] args) {

//		we can access static methods from interface using InterfaceName

		MyInterface.sayHello();

	}

}
