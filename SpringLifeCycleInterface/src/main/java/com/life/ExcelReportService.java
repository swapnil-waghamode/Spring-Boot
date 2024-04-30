package com.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelReportService implements InitializingBean, DisposableBean {

	private String fileName;
	private String mode;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From init method");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("From  destroy method");
	}

	public ExcelReportService() {
		super();
		System.out.println("From Constructor");
	}

	public String getFileName() {
		System.out.println("From Setter");
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "ExcelReportService [fileName=" + fileName + ", mode=" + mode + "]";
	}

}
