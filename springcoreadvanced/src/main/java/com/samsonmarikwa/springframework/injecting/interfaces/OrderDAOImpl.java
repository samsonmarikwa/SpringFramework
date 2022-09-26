package com.samsonmarikwa.springframework.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside Order DAO createOrder()");
	}

}
