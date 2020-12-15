package com.ngh.chill.util;

import java.sql.*;

public class Util {

	public static Connection getConnection() {
	 Connection connection = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost/db","root","DB-Password");
	}catch(Exception e) {
		e.printStackTrace();
	}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
