package com.ngh.chill.dao;

import java.sql.*;

import com.ngh.chill.pojo.LoginInfo;
import com.ngh.chill.util.Util;

public class LoginDao {
   
	public static boolean validation(LoginInfo user) {
	    boolean valid=false;
		try {
			Connection con = Util.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from login where username ='"+user.getUsername()+"' and password='"+user.getPassword()+"'");
			while(rs.next()) {
				valid=true;
			}
       Util.closeConnection(con);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return valid;
	}
}
