package com.ngx20080110.action.ch4;

import java.util.Map;

import com.ngx20080110.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction41 extends ActionSupport {
	
	public String execute() throws Exception {
		System.out.println(getUsers());
		if (getUsers().get("one").getName().equals("wugy") && getUsers().get("one").getPass().equals("wugy")) {
			setTip("Success");
			return SUCCESS;
		}
		else {
			setTip("Fail");
			return ERROR;
		}
	}

	private Map<String, User> users;
	private String tip;
	public Map<String, User> getUsers() {
		return users;
	}
	public void setUsers(Map<String, User> users) {
		this.users = users;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
}
