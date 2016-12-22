package com.ngx20080110.action.ch4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction411 extends ActionSupport {

	private String username;
	private String password;
	private InputStream inputStream;
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
	public InputStream getResult() {
		return inputStream;
	}
	
	public String execute() throws Exception {
		System.out.println("execute is called");
		inputStream = getUsername().equals(getPassword())
				? new ByteArrayInputStream(getText("login_tips").getBytes("UTF-8"))
				: new ByteArrayInputStream(getText("failTips").getBytes("UTF-8"));
		return SUCCESS;
				
	}
}
