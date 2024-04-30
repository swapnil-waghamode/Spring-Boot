package com.springlifecycle;

public class ExcelReportService {

	private String fileName;
	private String mode;

	public void setUp() {
		System.out.println("From Spring init ");
	}

	public void clean() {
		System.out.println("From spring destroy");
	}

	public ExcelReportService() {
		super();
	}

	public String getFileName() {
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
