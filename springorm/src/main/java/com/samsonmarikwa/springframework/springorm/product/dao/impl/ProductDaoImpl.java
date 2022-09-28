package com.samsonmarikwa.springframework.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samsonmarikwa.springframework.springorm.product.dao.ProductDao;
import com.samsonmarikwa.springframework.springorm.product.entity.Product;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired // inject the HibernateTemplate bean created in the config.xml file
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {
		return 0;
	}

}
