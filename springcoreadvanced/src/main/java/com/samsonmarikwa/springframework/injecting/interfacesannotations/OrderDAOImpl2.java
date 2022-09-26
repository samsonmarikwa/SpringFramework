package com.samsonmarikwa.springframework.injecting.interfacesannotations;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl2 DAO createOrder()");
	}

}
