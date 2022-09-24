package com.samsonmarikwa.springframework.autowiringannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;

	@Autowired
	public Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
