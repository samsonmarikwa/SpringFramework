package com.samsonmarikwa.springframework.springaop;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

}
