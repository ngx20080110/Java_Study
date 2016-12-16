package com.ngx20080110.action.ch4;

import java.util.List;

import com.ngx20080110.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction46 extends ActionSupport {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
