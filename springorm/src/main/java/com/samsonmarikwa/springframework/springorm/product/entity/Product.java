package com.samsonmarikwa.springframework.springorm.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // makes the class an entity. mandatory annotation
@Table(name = "product") // used when the table name is different to the entity, for example, prod
public class Product {

	@Id // mandatory annotation
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "description") // used when the field name is different to the column name in the database
									// table
	private String desc;

	@Column(name = "price")
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}

}
