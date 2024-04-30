package com.app.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cob")
public class MyCacheData {

	@Value("reddis")
	private String provider;

	public MyCacheData() {
		super();
	}

	@Override
	public String toString() {
		return "MyCacheData [provider=" + provider + "]";
	}

}
