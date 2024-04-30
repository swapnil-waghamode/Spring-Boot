package com.app.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyRepository {

	@Value("sample")
	private String entity;

	@Override
	public String toString() {
		return "MyRepository [entity=" + entity + "]";
	}

}
