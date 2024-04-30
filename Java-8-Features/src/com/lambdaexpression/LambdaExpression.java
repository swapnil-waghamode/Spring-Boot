package com.lambdaexpression;

public class LambdaExpression {

	public static void main(String[] args) {

		Employee emp = () -> "Software Engineer";

		System.out.println(emp.getName());
		
		Employee editor = () -> "Video Editor";
		System.out.println(editor.getName());

	}

}
