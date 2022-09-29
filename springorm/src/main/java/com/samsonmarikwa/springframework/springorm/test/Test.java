package com.samsonmarikwa.springframework.springorm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samsonmarikwa.springframework.springorm.product.dao.ProductDao;
import com.samsonmarikwa.springframework.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springframework/springorm/test/config.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productDao");
		
		// create new product
		Product product = new Product();
		product.setId(102);
		product.setName("Laptop");
		product.setDesc("Macbook Air");
		product.setPrice(2500.00);
		int result = productDao.create(product);
		System.out.println(result);
		
		// update product
		Product productUpdate = new Product();
		productUpdate.setId(102);
		productUpdate.setName("IPad");
		productUpdate.setDesc("IPad");
		productUpdate.setPrice(1500.00);
		productDao.update(productUpdate);
		
		// delete a product
		Product prod = new Product();
		prod.setId(101);	// only an id is required to be present.
		productDao.delete(prod);
		
		// Fetch a single product
		Product findProduct = productDao.find(100);
		System.out.println(findProduct);
		
		// Fetch a list of products
		List<Product> products = productDao.findAll();
		System.out.println(products);

	}

}
