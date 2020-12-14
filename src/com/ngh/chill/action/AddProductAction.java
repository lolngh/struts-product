package com.ngh.chill.action;

import com.ngh.chill.dao.ProductDao;
import com.ngh.chill.pojo.Product;

public class AddProductAction {

	Integer id;
	String name;
	String description;
	Integer price;
	
	public String execute() {
		String status ="";
		int result = ProductDao.addProduct(new Product(id,name,description,price));
		if(result ==1) {
			status="success";
			
		}
		else {
			status="input";
		}
		return status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
