package com.repoinservice;

public class Service {

	Repository repo;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repository getRepo() {
		return repo;
	}

	public void setRepo(Repository repo) {
		this.repo = repo;
	}

	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}

}
