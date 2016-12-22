package com.ngx20080110.action.ch4;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction410 extends ActionSupport {

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
	
	public String execute() throws Exception {
		System.out.println("In execute");
		Thread.sleep(1500);
		if (getUsername().equals("wugy") && getPassword().equals("wugy")) {
			ActionContext ctx = ActionContext.getContext();
			Map<String, Object> session = ctx.getSession();
			session.put("user", getUsername());
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
}
