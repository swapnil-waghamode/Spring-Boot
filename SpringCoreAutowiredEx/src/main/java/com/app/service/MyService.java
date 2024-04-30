package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.app.repo.MyRepository;

@Component
public class MyService {

	@Autowired
	MyRepository mrepo;

	@Override
	public String toString() {
		return "Service [mrepo=" + mrepo + "]";
	}
}
