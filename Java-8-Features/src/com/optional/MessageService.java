package com.optional;

import java.util.Optional;
import java.util.Scanner;

public class MessageService {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter user ID");
		int userId = sc.nextInt();

		// Normal approach
//		String UserName = new UserService().getUserNameById(userId);
//
//		if(UserName != null) {
//			String msg = UserName.toUpperCase() +", Hello";
//			System.out.println(msg);
//		}else {
//			System.out.println("Invlid ID");
//		}
		
//		Optional use case 
		Optional<String> name = new UserService().getUserName(userId);
		
		if(name.isPresent()) {
			System.out.println("Hello "+name.get());
		}else {
			System.out.println("No Data Found");
		}
		
		
	}
}
