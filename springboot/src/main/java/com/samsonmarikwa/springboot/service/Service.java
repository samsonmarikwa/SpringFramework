package com.samsonmarikwa.springboot.service;

import com.samsonmarikwa.springboot.dao.Dao;

@org.springframework.stereotype.Service
public class Service {

	Dao dao;
	
	Service(Dao dao) {
		System.out.println("Service Bean Created");
		this.dao = dao;
	}
	
	public void save() {
		dao.create();
	}
}
