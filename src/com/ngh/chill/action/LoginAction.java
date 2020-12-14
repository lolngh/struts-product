package com.ngh.chill.action;

import com.ngh.chill.dao.LoginDao;
import com.ngh.chill.pojo.LoginInfo;

public class LoginAction {

	String username;
	String password;
	
	public String execute() {
		String status="";
		boolean valid = LoginDao.validation(new LoginInfo(username,password));
		if(valid) {
			status ="success";
		}
		else {
			status="input";
		}
		return status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
