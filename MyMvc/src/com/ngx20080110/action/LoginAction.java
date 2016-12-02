package com.ngx20080110.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		if ("wugy".equals(getUsername()) && "wugy".equals(getPassword())) {
			ActionContext.getContext().getSession().put("user", getUsername());
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
	@Override
	public String toString() {
		return "LoginAction [username=" + username + ", password=" + password + "]";
	}
	private static final long serialVersionUID = 4615487117872406072L;
}
