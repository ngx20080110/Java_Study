package com.ngx20080110.action.ch4;

import com.ngx20080110.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction43 extends ActionSupport {
	public String execute() throws Exception {
		System.out.println("in execute");
		if (getUser().getName().equals("wugy") && getUser().getPass().equals("wugy")) {
			setTip("Success");
			return SUCCESS;
		}
		else {
			setTip("Fail");
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
}
