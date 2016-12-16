package com.ngx20080110.action.ch4;

import com.ngx20080110.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	public String execute() throws Exception {
		if (getUser().getName().equals("wugy") && getUser().getPass().equals("wugy")) {
			setTip("Converted");
			return SUCCESS;
		}
		else {
			setTip("Failed to convert");
			return ERROR;
		}
	}

	private User user;
	private String tip;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	@Override
	public String toString() {
		return "LoginAction [user=" + user + ", tip=" + tip + "]";
	}
	
}
