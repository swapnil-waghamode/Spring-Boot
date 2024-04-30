package com.springlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eobj")
public class ExcelReportService {

	@Value("excel")
	private String fileName;
	@Value("CSV format")
	private String mode;

	@PostConstruct
	public void setUp() {
		System.out.println("From Spring init ");
	}

	@PreDestroy
	public void clean() {
		System.out.println("From spring destroy");
	}

	@Override
	public String toString() {
		return "ExcelReportService [fileName=" + fileName + ", mode=" + mode + "]";
	}

}
