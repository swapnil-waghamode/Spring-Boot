package com.optional;

import java.util.Optional;

public class UserService {
	
	public String getUserNameById(int id) {
		
		if(id == 100) {
			return "Raju";
		}else if(id == 101) {
			return "Rani";
		}else if(id == 102) {
			return "John";
		}else {
			return null;
		}
	}
	
	
//	optional to avoid NullPointerException
	public Optional<String> getUserName(int id) {
		
		String name = null;
		
		if(id == 100) {
			name = "Raju";
		}else if(id == 101) {
			name = "Rani";
		}else if(id == 102) {
			name = "Rahul";
		}
		
		return Optional.ofNullable(name);
	}

}
