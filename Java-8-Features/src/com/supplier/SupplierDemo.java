package com.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

//		OTP generation using Supplier

		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 1; i <= 6; i++) {
				otp += (int) (Math.random() * 10);
			}

			return otp;
		};

		System.out.println("Your one time otp is : " + s.get());
		System.out.println("Your one time otp is : " + s.get());
		System.out.println("Your one time otp is : " + s.get());
	}
}
