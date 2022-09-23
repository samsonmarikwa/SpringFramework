package com.samsonmarikwa.springframework.propertyplaceholder;

public class MyDAO {
	
	private String dbSever;

	public MyDAO(String dbSever) {
		this.dbSever = dbSever;
	}

	public String getDbSever() {
		return dbSever;
	}

	public void setDbSever(String dbSever) {
		this.dbSever = dbSever;
	}

}
