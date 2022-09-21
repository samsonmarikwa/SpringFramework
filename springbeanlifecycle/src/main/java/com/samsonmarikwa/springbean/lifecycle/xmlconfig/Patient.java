package com.samsonmarikwa.springbean.lifecycle.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter method");
		this.id = id;
	}

	public void init() { // the name need not be init()
		System.out.println("Inside init Method");
	}

	public void destry() { // the nane need to be destroy
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
