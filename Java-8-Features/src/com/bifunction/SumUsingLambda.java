package com.bifunction;

import java.util.Scanner;
import java.util.function.BiFunction;

public class SumUsingLambda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		BiFunction<Integer, Integer, Integer> fun = (x, y) -> x + y;

		int sum = fun.apply(a, b);

		System.out.println("Sum Using lambda : " + sum);
	}
}
