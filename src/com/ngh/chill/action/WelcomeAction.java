package com.ngh.chill.action;

import java.util.List;

import com.ngh.chill.dao.ProductDao;
import com.ngh.chill.pojo.LoginInfo;
import com.ngh.chill.pojo.Product;

public class WelcomeAction {

	List<Product> products;
	//LoginInfo user;
    String username;
    
	public void initialise() {
		products = ProductDao.getAllProducts();
		//username=user.getUsername();
	}
	public String execute() {
		initialise();
		return "success";
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "WelcomeAction [products=" + products + "]";
	}
	
	
}
