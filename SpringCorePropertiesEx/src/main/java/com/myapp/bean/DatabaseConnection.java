package com.myapp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DatabaseConnection {

	@Value("${my.driver}")
	private String driver;

	@Value("${my.db-url}")
	private String url;

	@Value("${my.db_user}")
	private String user;

	@Value("${my.db-password}")
	private String pass;

	@Override
	public String toString() {
		return "DatabaseConnection [driver=" + driver + ", url=" + url + ", user=" + user + ", pass=" + pass + "]";
	}

}
