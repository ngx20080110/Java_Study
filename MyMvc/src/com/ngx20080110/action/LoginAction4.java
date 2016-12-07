package com.ngx20080110.action;

import java.sql.SQLException;

import com.ngx20080110.exception.MyException;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction4 extends ActionSupport {

	public String execute() throws Exception {
		if (getUsername().equalsIgnoreCase(("user"))) {
			throw new MyException(getText("custom_error"));
		}
		if (getUsername().equalsIgnoreCase("sql")) {
			throw new SQLException(getText("username_cannot_be_sql"));
		}
		if (getUsername().equals("wugy") && getPassword().equals("wugy")) {
			setTip(getText("login_tips"));
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

	private String username;
	private String password;
	private String tip;
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
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
}
