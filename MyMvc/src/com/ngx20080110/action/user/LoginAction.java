package com.ngx20080110.action.user;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	public String execute() {
		System.out.println("Login5Action execute");
		if (getUsername().equals("wugy") && getPassword().equals("wugy")) {
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
	private String username;
	private String password;
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
