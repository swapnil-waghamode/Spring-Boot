package com.datainrepo;

public class DataRepo {

	private Data data;

	public DataRepo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DataRepo [data=" + data + "]";
	}
	
	
}
