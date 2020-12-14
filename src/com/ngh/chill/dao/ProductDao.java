package com.ngh.chill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ngh.chill.pojo.Product;
import com.ngh.chill.util.Util;

public class ProductDao {

	public static List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		try {
			Connection con = Util.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while(rs.next()) {
				Product product = new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				products.add(product);
			}
			Util.closeConnection(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public static int addProduct(Product product) {
		int result=0;
		try {
			Connection con= Util.getConnection();
			PreparedStatement stmt = con.prepareStatement("insert into product values(?,?,?,?)");
			stmt.setInt(1, product.getId());
			stmt.setString(2,product.getName());
			stmt.setString(3,product.getDescription());
			stmt.setInt(4, product.getPrice());
			result = stmt.executeUpdate();
			
			Util.closeConnection(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
