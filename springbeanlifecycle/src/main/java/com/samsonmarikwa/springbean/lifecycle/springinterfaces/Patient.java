package com.samsonmarikwa.springbean.lifecycle.springinterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception { // this is the init method
		System.out.println("Inside afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside the destroy mentod");
	}

}
